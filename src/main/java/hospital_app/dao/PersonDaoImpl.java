package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.dto.Person;

public class PersonDaoImpl implements PersonInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		Person person2 = entityManager.find(Person.class, person.getPersonId());
		return person2;
	}

	public Person getPersonById(int personId) {
		return entityManager.find(Person.class, personId);
	}

	public Person updatePersonById(int personId, Person person) {
		Person person2 = entityManager.find(Person.class, personId);
		if(person.getAge()!=0) {
			person2.setAge(person.getAge());
		}
		if(person.getBloodGroup()!=null) {
			person2.setBloodGroup(person.getBloodGroup());
		}
		if(person.getDob()!=null) {
			person2.setDob(person.getDob());
		}
		if(person.getEmail()!=null) {
			person2.setEmail(person.getEmail());
		}
		if(person.getName()!=null) {
			person2.setName(person.getName());
		}
		if(person.getPhone()!=0) {
			person2.setPhone(person.getPhone());
		}
		if(person != null) {
			entityTransaction.begin();
			//person.setPersonId(person2.getPersonId());
			entityManager.merge(person2);
			entityTransaction.commit();
			return entityManager.find(Person.class, person2.getPersonId());
		}
		return null;
	}

	public boolean deletePersonById(int personId) {
		Person person = entityManager.find(Person.class, personId);
		if(person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public List<Person> getAllPersons() {
		Query query = entityManager.createQuery("SELECT p FROM Person p");
		List<Person> persons = query.getResultList();
		return persons;
	}
}
