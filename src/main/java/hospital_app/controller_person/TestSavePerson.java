package hospital_app.controller_person;

import java.time.LocalDateTime;

import hospital_app.dto.Person;
import hospital_app.service.PersonService;

public class TestSavePerson {
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = new Person();
		person.setName("Roshni");
		person.setEmail("rosh@gmail.com");
		person.setDob("05-11-1995");
		person.setBloodGroup("A+ve");
		person.setAge(26);
		person.setPhone(779845697);
		Person person2 = personService.savePerson(person);
		
		if(person2!=null) {
			System.out.println("Person data saved");
		}
		else {
			System.out.println("Person data not saved");
		}
	}
}
