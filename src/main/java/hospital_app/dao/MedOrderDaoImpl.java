package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Encounter;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;
import hospital_app.dto.Observation;

public class MedOrderDaoImpl implements MedOrderInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public MedOrder saveMedOrder(int encounterId, MedOrder medOrder) {
		Encounter encounter = entityManager.find(Encounter.class, encounterId);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return entityManager.find(MedOrder.class, medOrder.getMedOrderId());
	}

	public MedOrder getMedOrderById(int medOrderId) {
		return entityManager.find(MedOrder.class, medOrderId);
	}

	public List<MedOrder> getAllMedOrdersById(int medOrderId) {
		Query query = entityManager.createQuery("SELECT m FROM MedOrder m");
		List<MedOrder> medOrders = query.getResultList();
		return medOrders;
	}

	public MedOrder updateMedOrderById(int medOrderId, MedOrder medOrder) {
		MedOrder medOrder2 = entityManager.find(MedOrder.class, medOrderId);
		if(medOrder!=null) {
			if(medOrder.getDescription()!=null) {
				medOrder2.setDescription(medOrder.getDescription());
			}
			entityTransaction.begin();
			entityManager.merge(medOrder2);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder2.getMedOrderId());
		}
		return null;
	}
	

	public boolean deleteMedOrderById(int medOrderId) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrderId);
		if(medOrder!=null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}
//	public double totalBill(List<Item> items) {
//		return 0;
//	}

}
