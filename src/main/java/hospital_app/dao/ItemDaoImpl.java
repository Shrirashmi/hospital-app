package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Hospital;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class ItemDaoImpl implements ItemInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	public Item saveItem(int midOrderId, Item item) {
		
		MedOrder medOrder = entityManager.find(MedOrder.class, midOrderId);
		item.setMedOrder(medOrder);
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		Item item2 = entityManager.find(Item.class, item.getItemId());
		return item2;
	}

	public Item getItemById(int itemId) {
		return entityManager.find(Item.class, itemId);
	}

	public List<Item> getAllItemsById(int itemId) {
		Query query = entityManager.createQuery("SELECT i FROM Item i");
		List<Item> items = query.getResultList();
		return items;
	}

//	public double calculateCost() {
//		return 0;
//	}

}
