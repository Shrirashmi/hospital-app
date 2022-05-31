package hospital_app.controller_person;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestDeletePersonById {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		boolean a = personService.deletePersonById(10);
		if(a) {
			System.out.println("Person along with his encounter details removed.");
		}
		else {
			System.out.println("No Person with such id");
		}
	}
}
