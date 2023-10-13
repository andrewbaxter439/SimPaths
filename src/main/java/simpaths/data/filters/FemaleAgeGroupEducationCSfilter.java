package simpaths.data.filters;

import simpaths.model.Person;
import simpaths.model.enums.Education;
import simpaths.model.enums.Gender;
import microsim.statistics.ICollectionFilter;

public class FemaleAgeGroupEducationCSfilter implements ICollectionFilter{

	private int ageFrom;
	private int ageTo;
	private Education education;

	public FemaleAgeGroupEducationCSfilter(int ageFrom, int ageTo, Education education) {
		super();
		this.ageFrom = ageFrom;
		this.ageTo = ageTo;
		this.education = education;
	}
	
	public boolean isFiltered(Object object) {
		Person person = (Person) object;
		return ( person.getDgn().equals(Gender.Female) && (person.getDag() >= ageFrom) && (person.getDag() <= ageTo) && person.getDeh_c3().equals(education) );
	}
	
}

