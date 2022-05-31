package hospital_app.service;

import java.util.List;

import hospital_app.dto.Item;

public interface ItemInterfaceService {
	public abstract Item saveItem(int midOrderId, Item item);
	public abstract Item getItemById(int itemId);
	public abstract List<Item> getAllItemsById(int itemId);
	//public abstract boolean deleteItemById(int itemId);
	//public abstract double calculateCost();
}
