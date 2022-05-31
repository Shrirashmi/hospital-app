package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.dto.Observation;

public class ObservationDaoImpl implements ObservationInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Observation saveObservation(int encounterId, Observation observation) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);
		observation.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return entityManager.find(Observation.class, observation.getObservationId());

	}

	public Observation getObservationById(int observationId) {
		return entityManager.find(Observation.class, observationId);
	}

	public Observation updateObservationById(int observationId, Observation observation) {
		Observation observation2 = entityManager.find(Observation.class, observationId);
		if(observation2!=null) {
			if(observation.getDateTime()!=null) {
				observation2.setDateTime(observation.getDateTime());
			}
			if(observation.getDescription()!=null) {
				observation2.setDescription(observation.getDescription());
			}
			entityTransaction.begin();
			entityManager.merge(observation2);
			entityTransaction.commit();
			return entityManager.find(Observation.class, observation2.getObservationId());
		}
		return null;
	}

	public List<Observation> getAllObservationsByEncounterId(int encounterId) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);
		return encounter.getObservations();
	}
	
	public boolean deleteObservationById(int observationId) {
		Observation observation = entityManager.find(Observation.class, observationId);
		if(observation!=null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}
}
