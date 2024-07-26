package simpaths.model;

import microsim.matching.GlobalMatching;
import microsim.matching.IterativeRandomMatching;
import microsim.matching.MatchingClosure;
import microsim.matching.MatchingScoreClosure;
import org.apache.commons.math3.util.Pair;
import simpaths.data.Parameters;
import simpaths.model.enums.Dcpst;
import simpaths.model.enums.Gender;
import simpaths.model.enums.Household_status;

import java.util.*;

/**
 * CLASS TO MANAGE MATCHES BETWEEN PROSPECTIVE COHABITATION CANDIDATES
 */
public class UnionMatching {

    Pair<Set<Person>, Set<Person>> unmatched;
    Set<Person> unmatchedMales;
    Set<Person> unmatchedFemales;
    List<Pair<Person,Person>> matches = new ArrayList<>();
    int ageDiffBound = Parameters.AGE_DIFFERENCE_INITIAL_BOUND;
    boolean alignmentRun = false;
    double potentialHourlyEarningsDiffBound = Parameters.POTENTIAL_EARNINGS_DIFFERENCE_INITIAL_BOUND;


    // CONSTRUCTOR
    public UnionMatching(Pair<Set<Person>, Set<Person>> unmatched) {
        this.unmatched = unmatched;
        unmatchedMales = unmatched.getFirst();
        unmatchedFemales = unmatched.getSecond();
    }
    public UnionMatching(Pair<Set<Person>, Set<Person>> unmatched, boolean alignmentRun) {
        this(unmatched);
        this.alignmentRun = alignmentRun;
    }


    /**
     * HELPER METHODS
     */
    public List<Pair<Person,Person>> getMatches() {return matches;}


    // EVALUATE MATCHES BY ITERATIVE RANDOM MATCHING
    public void evaluateIRM() {

        // unmatched = IterativeSimpleMatching.getInstance().matching(
        unmatched = IterativeRandomMatching.getInstance().matching(

            unmatched.getFirst(),    //Males.  Allows to iterate (initially it is personsToMatch.get(Gender.Male).get(region))
            null,                    //No need for filter sub-population as group is already filtered by gender and region.
            new Comparator<Person>(){
                @Override
                public int compare(Person person1, Person person2) {
                    double valD = (person1.getCohabitRandomUniform4() - person2.getCohabitRandomUniform4())*10000.0;
                    return (int)valD;
                }
            },
            unmatched.getSecond(),
            null,
            new MatchingScoreClosure<Person>() {
                @Override
                public Double getValue(Person male, Person female) {
                    return localGetValue(male, female);
                }
            },
            new MatchingClosure<Person>() {
                @Override
                public void match(Person male, Person female) {        //The SimpleMatching.getInstance().matching() assumes the first collection in the argument (males in this case) is also the collection that the first argument of the MatchingClosure.match() is sampled from.
                    localMatch(male, female);
                }
            }
        );
    }

    // EVALUATE MATCHES BY GLOBAL MATCHING
    public void evaluateGM() {

        // unmatched = IterativeSimpleMatching.getInstance().matching(
        unmatched = GlobalMatching.getInstance().matching(

            unmatched.getFirst(),
            null,
            unmatched.getSecond(),
            null,
            new MatchingScoreClosure<Person>() {
                @Override
                public Double getValue(Person male, Person female) {
                    return localGetValue(male, female);
                }
            },
            new MatchingClosure<Person>() {
                @Override
                public void match(Person male, Person female) {        //The SimpleMatching.getInstance().matching() assumes the first collection in the argument (males in this case) is also the collection that the first argument of the MatchingClosure.match() is sampled from.
                    localMatch(male, female);
                }
            }
        );
    }


    private void localMatch(Person male, Person female) {

        if (!male.getDgn().equals(Gender.Male))
            throw new RuntimeException("male in match() of UnionMatching.evaluate does not actually have the Male gender type");
        if (!female.getDgn().equals(Gender.Female))
            throw new RuntimeException("female in match() of UnionMatching.evaluate does not actually have the Female gender type");

        unmatchedMales.remove(male);
        unmatchedFemales.remove(female);
        matches.add(new Pair<>(male, female));
        if (alignmentRun) {

            male.setHasTestPartner(true);
            female.setHasTestPartner(true);
        } else {

            if (!male.getRegion().equals(female.getRegion()))
                female.setRegion(male.getRegion());

            male.setPartner(female);
            female.setPartner(male);
            male.setHousehold_status(Household_status.Couple);
            female.setHousehold_status(Household_status.Couple);
            male.setDcpyy(0); //Set years in partnership to 0
            female.setDcpyy(0);
            male.setDcpst(Dcpst.Partnered);
            female.setDcpst(Dcpst.Partnered);

            //Update household
            male.setupNewBenefitUnit(true);        //All the lines below are executed within the setupNewHome() method for both male and female.  Note need to have partner reference before calling setupNewHome!
        }
    }

    private Double localGetValue(Person male, Person female) {

        if (!male.getDgn().equals(Gender.Male))
            throw new RuntimeException("male in getValue() of UnionMatching.evaluate does not actually have the Male gender type");
        if (!female.getDgn().equals(Gender.Female))
            throw new RuntimeException("female in getValue() of UnionMatching.evaluate does not actually have the Female gender type");

        // Differentials are defined in a way that (in case we break symmetry later), a higher
        // ageDiff and a higher earningsPotentialDiff favours this person, on the assumption that we
        // all want younger, wealthier partners.  However, it is probably not going to be used as we
        // will probably end up just trying to minimise the square difference between that observed
        // in data and here.
        double ageDiff = male.getDag() - female.getDag();            //If male.getDesiredAgeDiff > 0, favours younger women
        double potentialHourlyEarningsDiff = male.getFullTimeHourlyEarningsPotential() - female.getFullTimeHourlyEarningsPotential();        //If female.getDesiredEarningPotential > 0, favours wealthier men
        double earningsMatch = (potentialHourlyEarningsDiff - female.getDesiredEarningsPotentialDiff());
        double ageMatch = (ageDiff - male.getDesiredAgeDiff());
        // term to enhance replication of simulated projections
        //double rndMatch = (male.getCohabitRandomUniform() - female.getCohabitRandomUniform()) * 10.0;

        if (ageMatch < ageDiffBound && earningsMatch < potentialHourlyEarningsDiffBound) {

            // Score currently based on an equally weighted measure.  The Iterative (Simple and Random) Matching algorithm prioritises matching to the potential partner that returns the lowest score from this method (therefore, on aggregate we are trying to minimize the value below).
            return earningsMatch * earningsMatch + ageMatch * ageMatch;
        } else return Double.POSITIVE_INFINITY;        //Not to be included in possible partners
    }
}
