package hospital_app.controller_person;

import java.time.LocalDateTime;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestUpdatePersonById {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = new Person();
		person.setDob("21-03-12");
		person.setEmail("ram@mail.com");
		person.setAge(19);
		Person person2 = personService.updatePersonById(4, person);
		if(person2!=null) {
			System.out.println("Details updated");
		}
		else {
			System.out.println("No such personId found");
		}
	}
}
