package hospital_app.controller_person;

import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = personService.getPersonById(9);
		if(person!=null) {
			System.out.println(person);
		}
		else {
			System.out.println("Id not found");
		}
	}
}
