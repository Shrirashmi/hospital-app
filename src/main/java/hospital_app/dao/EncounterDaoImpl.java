package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class EncounterDaoImpl implements EncounterInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Encounter saveEncounter(int branchId, int personId, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, branchId);
		encounter.setBranch(branch);
		Person person = entityManager.find(Person.class, personId);
		encounter.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return entityManager.find(Encounter.class, encounter.getEncounterId());

	}

	public Encounter getEncounterById(int encounterId) {
		return entityManager.find(Encounter.class, encounterId);
	}

	public boolean deleteEncounterById(int encounterId) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);
		if(encounter!=null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public List<Encounter> getAllEncountersByIdPersonId(int personId) {
		Query query = entityManager.createQuery("SELECT e FROM Encounter e WHERE e.person.personId=?1");
		query.setParameter(1, personId);
		List<Encounter> encounters = query.getResultList();
		return encounters;
	}

	public List<Encounter> getAllEncounterByBranchId(int branchId) {
		Query query = entityManager.createQuery("SELECT e FROM Encounter e WHERE e.branch.branchId=?1");
		query.setParameter(1, branchId);
		List<Encounter> encounters = query.getResultList();
		return encounters;
	}

	public Encounter updateEncounterById(int encounterId, Encounter encounter) {
		Encounter encounter2 = entityManager.find(Encounter.class, encounterId);
		if(encounter2!=null) {
			if(encounter.getAdmitDateTime()!=null) {
				encounter2.setAdmitDateTime(encounter.getAdmitDateTime());
			}
			if(encounter.getDischargeDateTime()!=null) {
				encounter2.setDischargeDateTime(encounter.getDischargeDateTime());
			}
			if(encounter.getReason()!=null) {
				encounter2.setReason(encounter.getReason());
			}
			entityTransaction.begin();
			entityManager.merge(encounter2);
			entityTransaction.commit();
			return entityManager.find(Encounter.class, encounter2.getEncounterId());
		}
		return null;
	}


}
