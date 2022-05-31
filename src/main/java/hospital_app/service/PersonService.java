package hospital_app.service;

import java.util.List;

import hospital_app.dao.PersonDaoImpl;
import hospital_app.dto.Person;

public class PersonService {
	PersonDaoImpl dao = new PersonDaoImpl();
	public Person savePerson(Person person) {
		return dao.savePerson(person);
	}

	public Person getPersonById(int personId) {
		return dao.getPersonById(personId);
	}

	public Person updatePersonById(int personId, Person person) {
		return dao.updatePersonById(personId, person);
	}

	public boolean deletePersonById(int personId) {
		return dao.deletePersonById(personId);
	}

	public List<Person> getAllPersons() {
		return dao.getAllPersons();
	}
}
