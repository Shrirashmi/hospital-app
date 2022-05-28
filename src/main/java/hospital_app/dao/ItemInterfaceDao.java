package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;

public interface ItemInterfaceDao {
	public abstract Item saveItem(int midOrderId, Item item);
	public abstract Item getItemById(int itemId);
	public abstract List<Item> getAllItemsByMedOrderId(int medOrderId);
	//public abstract Item updateItemById(int itemId, Observation observation, Item item);
	//public abstract boolean deleteItemById(int itemId);
	public abstract double calculateCost();
}
