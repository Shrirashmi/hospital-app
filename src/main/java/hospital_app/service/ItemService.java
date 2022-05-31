package hospital_app.service;

import java.util.List;

import hospital_app.dao.ItemDaoImpl;
import hospital_app.dto.Item;

public class ItemService {
	ItemDaoImpl dao = new ItemDaoImpl();
	public Item saveItem(int midOrderId, Item item) {
		return dao.saveItem(midOrderId, item);
	}

	public Item getItemById(int itemId) {
		return dao.getItemById(itemId);
	}

	public List<Item> getAllItemsById(int itemId) {
		return dao.getAllItemsById(itemId);
	}

//	public double calculateCost() {
//		return 0;
//	}
}
