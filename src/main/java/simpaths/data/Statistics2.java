package simpaths.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import microsim.data.db.PanelEntityKey;
import simpaths.model.Person;
import simpaths.model.SimPathsModel;
import simpaths.model.enums.Education;
import simpaths.model.enums.Indicator;
import simpaths.model.enums.TimeSeriesVariable;

@Entity
public class Statistics2 {

    @Id
    private PanelEntityKey key = new PanelEntityKey(1L);

    //population shares in cohabiting relationships
    @Column(name = "pr_married_18_29")
    private double prMarried18to29;

    @Column(name = "pr_married_30_54")
    private double prMarried30to54;

    @Column(name = "pr_married_55_74")
    private double prMarried55to74;

    //average dependent children
    @Column(name = "avkids_18_29")
    private double avkids18to29;

    @Column(name = "avkids_30_54")
    private double avkids30to54;

    @Column(name = "avkids_55_74")
    private double avkids55to74;

    //average health
    @Column(name = "health_18_29")
    private double health18to29;

    @Column(name = "health_30_54")
    private double health30to54;

    @Column(name = "health_55_74")
    private double health55to74;

    //population shares disabled
    @Column(name = "pr_disabled_18_29")
    private double prDisabled18to29;

    @Column(name = "pr_disabled_30_54")
    private double prDisabled30to54;

    @Column(name = "pr_disabled_55_74")
    private double prDisabled55to74;

    //average labour status by age and gender
    @Column(name = "work_fulltime_18_29")
    private double workFulltime18to29;

    @Column(name = "work_fulltime_30_54")
    private double workFulltime30to54;

    @Column(name = "work_fulltime_55_74")
    private double workFulltime55to74;

    @Column(name = "work_parttime_18_29")
    private double workParttime18to29;

    @Column(name = "work_parttime_30_54")
    private double workParttime30to54;

    @Column(name = "work_parttime_55_74")
    private double workParttime55to74;

    @Column(name = "work_none_18_29")
    private double workNone18to29;

    @Column(name = "work_none_30_54")
    private double workNone30to54;

    @Column(name = "work_none_55_74")
    private double workNone55to74;

    //employment income
    @Column(name = "labourIncome_18_29")
    private double labourIncome18to29;

    @Column(name = "labourIncome_30_54")
    private double labourIncome30to54;

    @Column(name = "labourIncome_55_74")
    private double labourIncome55to74;

    //investment income
    @Column(name = "investmentIncome_18_29")
    private double investmentIncome18to29;

    @Column(name = "investmentIncome_30_54")
    private double investmentIncome30to54;

    @Column(name = "investmentIncome_55_74")
    private double investmentIncome55to74;

    //pension income
    @Column(name = "pensionIncome_18_29")
    private double pensionIncome18to29;

    @Column(name = "pensionIncome_30_54")
    private double pensionIncome30to54;

    @Column(name = "pensionIncome_55_74")
    private double pensionIncome55to74;

    //disposable income
    @Column(name = "disposableIncome_18_29")
    private double disposableIncome18to29;

    @Column(name = "disposableIncome_30_54")
    private double disposableIncome30to54;

    @Column(name = "disposableIncome_55_74")
    private double disposableIncome55to74;

    //investment losses
    @Column(name = "investmentLosses_18_29")
    private double investmentLosses18to29;

    @Column(name = "investmentLosses_30_54")
    private double investmentLosses30to54;

    @Column(name = "investmentLosses_55_74")
    private double investmentLosses55to74;

    //disposable income gross of investment losses
    @Column(name = "dispInc_grossLosses_18_29")
    private double dispIncomeGrossOfLosses18to29;

    @Column(name = "dispInc_grossLosses_30_54")
    private double dispIncomeGrossOfLosses30to54;

    @Column(name = "dispInc_grossLosses_55_74")
    private double dispIncomeGrossOfLosses55to74;

    //expenditure
    @Column(name = "expenditure_18_29")
    private double expenditure18to29;

    @Column(name = "expenditure_30_54")
    private double expenditure30to54;

    @Column(name = "expenditure_55_74")
    private double expenditure55to74;

    //consumption to leisure ratios
    @Column(name = "cons_to_leis_ratio")
    private double consToLeisRatio;

    //wealth
    @Column(name = "wealth_18_29")
    private double wealth18to29;

    @Column(name = "wealth_30_54")
    private double wealth30to54;

    @Column(name = "wealth_55_74")
    private double wealth55to74;

    @Column(name= "population_18_29")
    private double population18to29;

    @Column(name= "population_30_54")
    private double population30to54;

    @Column(name= "population_55_74")
    private double population55to74;

    @Column(name= "social_care_adj_factor")
    private double socialCareAdjustmentFactor;

    @Column(name = "partnership_adj_factor")
    private double partnershipAdjustmentFactor;

    @Column(name = "utility_adj_factor_smales")
    private double utilityAdjustmentFactorSmales;

    @Column(name = "utility_adj_factor_sfemales")
    private double utilityAdjustmentFactorSfemales;

    @Column(name = "utility_adj_factor_couples")
    private double utilityAdjustmentFactorCouples;

    public double getConsToLeisRatio() {
        return consToLeisRatio;
    }

    public void setConsToLeisRatio(double consToLeis) {
        this.consToLeisRatio = consToLeis;
    }

    public double getPartnershipAdjustmentFactor() {
        return partnershipAdjustmentFactor;
    }

    public void setPartnershipAdjustmentFactor(double partnershipAdjustmentFactor) {
        this.partnershipAdjustmentFactor = partnershipAdjustmentFactor;
    }

    public double getUtilityAdjustmentFactorSmales() {
        return utilityAdjustmentFactorSmales;
    }

    public void setUtilityAdjustmentFactorSmales(double utilityAdjustmentFactorSmales) {
        this.utilityAdjustmentFactorSmales = utilityAdjustmentFactorSmales;
    }

    public double getUtilityAdjustmentFactorSfemales() {
        return utilityAdjustmentFactorSfemales;
    }

    public void setUtilityAdjustmentFactorSfemales(double utilityAdjustmentFactorSfemales) {
        this.utilityAdjustmentFactorSfemales = utilityAdjustmentFactorSfemales;
    }

    public double getUtilityAdjustmentFactorCouples() {
        return utilityAdjustmentFactorCouples;
    }

    public void setUtilityAdjustmentFactorCouples(double utilityAdjustmentFactorCouples) {
        this.utilityAdjustmentFactorCouples = utilityAdjustmentFactorCouples;
    }

    public double getSocialCareAdjustmentFactor() { return socialCareAdjustmentFactor; }
    public void setSocialCareAdjustmentFactor(double factor) {socialCareAdjustmentFactor = factor;}

    public double getPopulation18to29() {
        return population18to29;
    }

    public void setPopulation18to29(double population18to29) {
        this.population18to29 = population18to29;
    }

    public double getPopulation55to74() {
        return population55to74;
    }

    public void setPopulation30to54(double population30to54) {
        this.population30to54 = population30to54;
    }

    public double getPopulation30to54() {
        return population30to54;
    }

    public void setPopulation55to74(double population55to74) {
        this.population55to74 = population55to74;
    }

    public double getPrMarried18to29() {
        return prMarried18to29;
    }

    public void setPrMarried18to29(double prMarried18to29) {
        this.prMarried18to29 = prMarried18to29;
    }

    public double getPrMarried30to54() {
        return prMarried30to54;
    }

    public void setPrMarried30to54(double prMarried30to54) {
        this.prMarried30to54 = prMarried30to54;
    }

    public double getPrMarried55to74() {
        return prMarried55to74;
    }

    public void setPrMarried55to74(double prMarried55to74) {
        this.prMarried55to74 = prMarried55to74;
    }

    public double getAvkids18to29() {
        return avkids18to29;
    }

    public void setAvkids18to29(double avkids18to29) {
        this.avkids18to29 = avkids18to29;
    }

    public double getAvkids30to54() {
        return avkids30to54;
    }

    public void setAvkids30to54(double avkids30to54) {
        this.avkids30to54 = avkids30to54;
    }

    public double getAvkids55to74() {
        return avkids55to74;
    }

    public void setAvkids55to74(double avkids55to74) {
        this.avkids55to74 = avkids55to74;
    }

    public double getHealth18to29() {
        return health18to29;
    }

    public void setHealth18to29(double health18to29) {
        this.health18to29 = health18to29;
    }

    public double getHealth30to54() {
        return health30to54;
    }

    public void setHealth30to54(double health30to54) {
        this.health30to54 = health30to54;
    }

    public double getHealth55to74() {
        return health55to74;
    }

    public void setHealth55to74(double health55to74) {
        this.health55to74 = health55to74;
    }

    public double getPrDisabled18to29() {
        return prDisabled18to29;
    }

    public void setPrDisabled18to29(double prDisabled18to29) {
        this.prDisabled18to29 = prDisabled18to29;
    }

    public double getPrDisabled30to54() {
        return prDisabled30to54;
    }

    public void setPrDisabled30to54(double prDisabled30to54) {
        this.prDisabled30to54 = prDisabled30to54;
    }

    public double getPrDisabled55to74() {
        return prDisabled55to74;
    }

    public void setPrDisabled55to74(double prDisabled55to74) {
        this.prDisabled55to74 = prDisabled55to74;
    }

    public double getLabourIncome18to29() {
        return labourIncome18to29;
    }

    public void setLabourIncome18to29(double labourIncome18to29) {
        this.labourIncome18to29 = labourIncome18to29;
    }

    public double getLabourIncome30to54() {
        return labourIncome30to54;
    }

    public void setLabourIncome30to54(double labourIncome30to54) {
        this.labourIncome30to54 = labourIncome30to54;
    }

    public double getLabourIncome55to74() {
        return labourIncome55to74;
    }

    public void setLabourIncome55to74(double labourIncome55to74) {
        this.labourIncome55to74 = labourIncome55to74;
    }

    public double getInvestmentIncome18to29() {
        return investmentIncome18to29;
    }

    public void setInvestmentIncome18to29(double investmentIncome18to29) {
        this.investmentIncome18to29 = investmentIncome18to29;
    }

    public double getInvestmentIncome30to54() {
        return investmentIncome30to54;
    }

    public void setInvestmentIncome30to54(double investmentIncome30to54) {
        this.investmentIncome30to54 = investmentIncome30to54;
    }

    public double getInvestmentIncome55to74() {
        return investmentIncome55to74;
    }

    public void setInvestmentIncome55to74(double investmentIncome55to74) {
        this.investmentIncome55to74 = investmentIncome55to74;
    }

    public double getPensionIncome18to29() {
        return pensionIncome18to29;
    }

    public void setPensionIncome18to29(double pensionIncome18to29) {
        this.pensionIncome18to29 = pensionIncome18to29;
    }

    public double getPensionIncome30to54() {
        return pensionIncome30to54;
    }

    public void setPensionIncome30to54(double pensionIncome30to54) {
        this.pensionIncome30to54 = pensionIncome30to54;
    }

    public double getPensionIncome55to74() {
        return pensionIncome55to74;
    }

    public void setPensionIncome55to74(double pensionIncome55to74) {
        this.pensionIncome55to74 = pensionIncome55to74;
    }

    public double getDisposableIncome18to29() {
        return disposableIncome18to29;
    }

    public void setDisposableIncome18to29(double disposableIncome18to29) {
        this.disposableIncome18to29 = disposableIncome18to29;
    }

    public double getDisposableIncome30to54() {
        return disposableIncome30to54;
    }

    public void setDisposableIncome30to54(double disposableIncome30to54) {
        this.disposableIncome30to54 = disposableIncome30to54;
    }

    public double getDisposableIncome55to74() {
        return disposableIncome55to74;
    }

    public void setDisposableIncome55to74(double disposableIncome55to74) {
        this.disposableIncome55to74 = disposableIncome55to74;
    }

    public double getInvestmentLosses18to29() {
        return investmentLosses18to29;
    }

    public void setInvestmentLosses18to29(double investmentLosses18to29) {
        this.investmentLosses18to29 = investmentLosses18to29;
    }

    public double getInvestmentLosses30to54() {
        return investmentLosses30to54;
    }

    public void setInvestmentLosses30to54(double investmentLosses30to54) {
        this.investmentLosses30to54 = investmentLosses30to54;
    }

    public double getInvestmentLosses55to74() {
        return investmentLosses55to74;
    }

    public void setInvestmentLosses55to74(double investmentLosses55to74) {
        this.investmentLosses55to74 = investmentLosses55to74;
    }

    public double getDispIncomeGrossOfLosses18to29() {
        return dispIncomeGrossOfLosses18to29;
    }

    public void setDispIncomeGrossOfLosses18to29(double dispIncomeGrossOfLosses18to29) {
        this.dispIncomeGrossOfLosses18to29 = dispIncomeGrossOfLosses18to29;
    }

    public double getDispIncomeGrossOfLosses30to54() {
        return dispIncomeGrossOfLosses30to54;
    }

    public void setDispIncomeGrossOfLosses30to54(double dispIncomeGrossOfLosses30to54) {
        this.dispIncomeGrossOfLosses30to54 = dispIncomeGrossOfLosses30to54;
    }

    public double getDispIncomeGrossOfLosses55to74() {
        return dispIncomeGrossOfLosses55to74;
    }

    public void setDispIncomeGrossOfLosses55to74(double dispIncomeGrossOfLosses55to74) {
        this.dispIncomeGrossOfLosses55to74 = dispIncomeGrossOfLosses55to74;
    }

    public double getExpenditure18to29() {
        return expenditure18to29;
    }

    public void setExpenditure18to29(double expenditure18to29) {
        this.expenditure18to29 = expenditure18to29;
    }

    public double getExpenditure30to54() {
        return expenditure30to54;
    }

    public void setExpenditure30to54(double expenditure30to54) {
        this.expenditure30to54 = expenditure30to54;
    }

    public double getExpenditure55to74() {
        return expenditure55to74;
    }

    public void setExpenditure55to74(double expenditure55to74) {
        this.expenditure55to74 = expenditure55to74;
    }

    public double getWealth18to29() {
        return wealth18to29;
    }

    public void setWealth18to29(double wealth18to29) {
        this.wealth18to29 = wealth18to29;
    }

    public double getWealth30to54() {
        return wealth30to54;
    }

    public void setWealth30to54(double wealth30to54) {
        this.wealth30to54 = wealth30to54;
    }

    public double getWealth55to74() {
        return wealth55to74;
    }

    public void setWealth55to74(double wealth55to74) {
        this.wealth55to74 = wealth55to74;
    }

    public double getWorkFulltime18to29() {
        return workFulltime18to29;
    }

    public void setWorkFulltime18to29(double workFulltime18to29) {
        this.workFulltime18to29 = workFulltime18to29;
    }

    public double getWorkFulltime30to54() {
        return workFulltime30to54;
    }

    public void setWorkFulltime30to54(double workFulltime30to54) {
        this.workFulltime30to54 = workFulltime30to54;
    }

    public double getWorkFulltime55to74() {
        return workFulltime55to74;
    }

    public void setWorkFulltime55to74(double workFulltime55to74) {
        this.workFulltime55to74 = workFulltime55to74;
    }

    public double getWorkParttime18to29() {
        return workParttime18to29;
    }

    public void setWorkParttime18to29(double workParttime18to29) {
        this.workParttime18to29 = workParttime18to29;
    }

    public double getWorkParttime30to54() {
        return workParttime30to54;
    }

    public void setWorkParttime30to54(double workParttime30to54) {
        this.workParttime30to54 = workParttime30to54;
    }

    public double getWorkParttime55to74() {
        return workParttime55to74;
    }

    public void setWorkParttime55to74(double workParttime55to74) {
        this.workParttime55to74 = workParttime55to74;
    }

    public double getWorkNone18to29() {
        return workNone18to29;
    }

    public void setWorkNone18to29(double workNone18to29) {
        this.workNone18to29 = workNone18to29;
    }

    public double getWorkNone30to54() {
        return workNone30to54;
    }

    public void setWorkNone30to54(double workNone30to54) {
        this.workNone30to54 = workNone30to54;
    }

    public double getWorkNone55to74() {
        return workNone55to74;
    }

    public void setWorkNone55to74(double workNone55to74) {
        this.workNone55to74 = workNone55to74;
    }

    public void update(SimPathsModel model) {

        // initialise outputs
        double[] prMarr = {0.,0.,0.};
        double[] avkids = {0.,0.,0.};
        double[] health = {0.,0.,0.};
        double[] prDisa = {0.,0.,0.};
        double[] workFT = {0.,0.,0.};
        double[] workPT = {0.,0.,0.};
        double[] workNn = {0.,0.,0.};
        double[] labInc = {0.,0.,0.};
        double[] invInc = {0.,0.,0.};
        double[] invLosses = {0.,0.,0.};
        double[] penInc = {0.,0.,0.};
        double[] disInc = {0.,0.,0.};
        double[] grossDisInc = {0.,0.,0.};
        double[] expen = {0.,0.,0.};
        double[] wealth = {0.,0.,0.};
        double[] popula = {0.,0.,0.};
        double ctlNG = 0.0, ctlG = 0.0;
        double numberNG = 0.0, numberG = 0.0;
        for (Person person : model.getPersons()) {
            // loop over entire population

            int ii = -1;
            if (person.getDag()>=18 && person.getDag()<=29) {
                ii = 0;
            } else if (person.getDag()>=30 && person.getDag()<=54) {
                ii = 1;
            } else if (person.getDag()>=55 && person.getDag()<=74) {
                ii = 2;
            }
            if (ii>=0) {

                double es = person.getBenefitUnit().getEquivalisedWeight();
                
                prMarr[ii] += person.getCohabiting();
                avkids[ii] += person.getBenefitUnit().getNumberChildrenAll();
                health[ii] += person.getDheValue();
                prDisa[ii] += (Indicator.True.equals(person.getDlltsd()))? 1.0: 0.0;
                labInc[ii] += person.getEarningsWeekly();
                if ((double)person.getLabourSupplyHoursWeekly() > Parameters.MIN_HOURS_FULL_TIME_EMPLOYED)
                    workFT[ii] += 1.0;
                else if ((double)person.getLabourSupplyHoursWeekly() > 1.0)
                    workPT[ii] += 1.0;
                else
                    workNn[ii] += 1.0;
                invInc[ii] += person.getBenefitUnit().getInvestmentIncomeAnnual() / 12.0 / es;
                penInc[ii] += person.getBenefitUnit().getPensionIncomeAnnual() / 12.0 / es;
                disInc[ii] += person.getBenefitUnit().getDisposableIncomeMonthly() / es;
                if (person.getBenefitUnit().getInvestmentIncomeAnnual()<0.0) {
                    invLosses[ii] += person.getBenefitUnit().getInvestmentIncomeAnnual() / 12.0 / es;
                    grossDisInc[ii] += (person.getBenefitUnit().getDisposableIncomeMonthly() -
                            person.getBenefitUnit().getInvestmentIncomeAnnual() / 12.0) / es;
                } else {
                    grossDisInc[ii] += person.getBenefitUnit().getDisposableIncomeMonthly() / es;
                }
                double expenditurePerMonth = person.getBenefitUnit().getDiscretionaryConsumptionPerYear(false) / 12.0 +
                        person.getBenefitUnit().getChildcareCostPerWeek(false) * Parameters.WEEKS_PER_MONTH +
                        person.getBenefitUnit().getSocialCareCostPerWeek(false) * Parameters.WEEKS_PER_MONTH;
                if (expenditurePerMonth > 0.0) {
                    expenditurePerMonth /= es;
                    expen[ii] += Math.log(expenditurePerMonth);
                }
                if (person.getDag()>=55 && person.getDag()<=60) {

                    if (Education.High.equals(person.getDeh_c3())) {
                        numberG += 1.0;
                        ctlG += expenditurePerMonth / Parameters.WEEKS_PER_MONTH / person.getLeisureHoursPerWeek();
                    } else {
                        numberNG += 1.0;
                        ctlNG += expenditurePerMonth / Parameters.WEEKS_PER_MONTH / person.getLeisureHoursPerWeek();
                    }
                }
                wealth[ii] += person.getBenefitUnit().getLiquidWealth(false) / es;
                popula[ii] += 1.0;
            }
        }
        if (numberG>0.1) {
            ctlG /= numberG;
        }
        if (numberNG>0.1) {
            ctlNG /= numberNG;
        }
        for (int ii=0; ii<=2; ii++) {

            if (popula[ii]>=0) {

                labInc[ii] /= (workFT[ii] + workPT[ii]);
                prMarr[ii] /= popula[ii];
                avkids[ii] /= popula[ii];
                health[ii] /= popula[ii];
                prDisa[ii] /= popula[ii];
                workFT[ii] /= popula[ii];
                workPT[ii] /= popula[ii];
                workNn[ii] /= popula[ii];
                invInc[ii] /= popula[ii];
                penInc[ii] /= popula[ii];
                disInc[ii] /= popula[ii];
                invLosses[ii] /= popula[ii];
                grossDisInc[ii] /= popula[ii];
                expen[ii] = Math.exp(expen[ii] / popula[ii]);
                wealth[ii] /= popula[ii];
            }
        }

        // update calibration statistics as differences to target moments
        workFT[0] -= 0.5274865;
        workFT[1] -= 0.6195412;
        workFT[2] -= 0.2535846;

        workPT[0] -= 0.1975203;
        workPT[1] -= 0.2230833;
        workPT[2] -= 0.1891631;

        expen[0] -= 165.8951 * Parameters.WEEKS_PER_MONTH;
        expen[1] -= 309.2464 * Parameters.WEEKS_PER_MONTH;
        expen[2] -= 323.1081 * Parameters.WEEKS_PER_MONTH;

        double ctlRatio = ctlG / ctlNG - 1.361384;


        // map statistics to outputs
        setPrMarried18to29(prMarr[0]);
        setPrMarried30to54(prMarr[1]);
        setPrMarried55to74(prMarr[2]);

        setAvkids18to29(avkids[0]);
        setAvkids30to54(avkids[1]);
        setAvkids55to74(avkids[2]);

        setHealth18to29(health[0]);
        setHealth30to54(health[1]);
        setHealth55to74(health[2]);

        setPrDisabled18to29(prDisa[0]);
        setPrDisabled30to54(prDisa[1]);
        setPrDisabled55to74(prDisa[2]);

        setWorkFulltime18to29(workFT[0]);
        setWorkFulltime30to54(workFT[1]);
        setWorkFulltime55to74(workFT[2]);

        setWorkParttime18to29(workPT[0]);
        setWorkParttime30to54(workPT[1]);
        setWorkParttime55to74(workPT[2]);

        setWorkNone18to29(workNn[0]);
        setWorkNone30to54(workNn[1]);
        setWorkNone55to74(workNn[2]);

        setLabourIncome18to29(labInc[0]);
        setLabourIncome30to54(labInc[1]);
        setLabourIncome55to74(labInc[2]);

        setInvestmentIncome18to29(invInc[0]);
        setInvestmentIncome30to54(invInc[1]);
        setInvestmentIncome55to74(invInc[2]);

        setPensionIncome18to29(penInc[0]);
        setPensionIncome30to54(penInc[1]);
        setPensionIncome55to74(penInc[2]);

        setDisposableIncome18to29(disInc[0]);
        setDisposableIncome30to54(disInc[1]);
        setDisposableIncome55to74(disInc[2]);

        setInvestmentLosses18to29(invLosses[0]);
        setInvestmentLosses30to54(invLosses[1]);
        setInvestmentLosses55to74(invLosses[2]);

        setDispIncomeGrossOfLosses18to29(grossDisInc[0]);
        setDispIncomeGrossOfLosses30to54(grossDisInc[1]);
        setDispIncomeGrossOfLosses55to74(grossDisInc[2]);

        setExpenditure18to29(expen[0]);
        setExpenditure30to54(expen[1]);
        setExpenditure55to74(expen[2]);

        setConsToLeisRatio(ctlRatio);

        setWealth18to29(wealth[0]);
        setWealth30to54(wealth[1]);
        setWealth55to74(wealth[2]);

        setPopulation18to29(popula[0]);
        setPopulation30to54(popula[1]);
        setPopulation55to74(popula[2]);

        setSocialCareAdjustmentFactor(Parameters.getTimeSeriesValue(model.getYear()-1, TimeSeriesVariable.CareProvisionAdjustment));
        setPartnershipAdjustmentFactor(Parameters.getTimeSeriesValue(model.getYear()-1, TimeSeriesVariable.PartnershipAdjustment));
        setUtilityAdjustmentFactorSmales(Parameters.getTimeSeriesValue(model.getYear()-1, TimeSeriesVariable.UtilityAdjustmentSingleMales));
        setUtilityAdjustmentFactorSfemales(Parameters.getTimeSeriesValue(model.getYear()-1, TimeSeriesVariable.UtilityAdjustmentSingleFemales));
        setUtilityAdjustmentFactorCouples(Parameters.getTimeSeriesValue(model.getYear()-1, TimeSeriesVariable.UtilityAdjustmentCouples));
    }
}
