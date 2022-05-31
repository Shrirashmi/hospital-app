package hospital_app.controller_person;

import java.util.List;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestGetAllPersons {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		List<Person> persons = personService.getAllPersons();
		if (persons.size() > 0) {
			for (Person person : persons)
				System.out.println(person);
		}
	}
}