package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class HospitalDaoImpl implements HospitalInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getHospitalId());
	}

	public Hospital getHospitalById(int hospitalId) {
		return entityManager.find(Hospital.class, hospitalId);
	}

	public Hospital getHospitalByName(String name) {
		String sql = "SELECT h FROM Hospital h WHERE h.name = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);

		Hospital hospital = (Hospital) query.getSingleResult();
		return hospital;
	}

	public Hospital updateHospitalById(int hospitalId, Hospital hospital) {
		Hospital hospital2 = entityManager.find(Hospital.class, hospitalId);
		if(hospital.getGstNo()!=null)
		{
			hospital2.setGstNo(hospital.getGstNo());
		}
		if(hospital.getName()!=null)
		{
			hospital2.setName(hospital.getName());
		}
		if(hospital.getWebsite()!=null)
		{
			hospital2.setWebsite(hospital.getWebsite());
		}
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.merge(hospital2);
			entityTransaction.commit();
			return entityManager.find(Hospital.class, hospital2.getHospitalId());
		} else {
			return null;
		}
	}

	public boolean deleteHospitalById(int hospitalId) {
		Hospital hospital = entityManager.find(Hospital.class, hospitalId);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	public List<Hospital> getAllHospitals() {
		Query query = entityManager.createQuery("SELECT h FROM Hospital h");
		List<Hospital> hospitals = query.getResultList();
		return hospitals;
	}

}
