package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public interface MedOrderInterfaceDao {
	public abstract MedOrder saveMedOrder(int encounterId, MedOrder medOrder);
	public abstract MedOrder getMedOrderById(int medOrderId);
	public abstract List<MedOrder> getAllMedOrdersByEncounterId(int encounterId);
	public abstract MedOrder updateMedOrderById(int medOrderId, MedOrder medOrder);
	public abstract double totalBill(List<Item> items);
	//public abstract boolean deleteMedOrderById(int medOrder);
	
}
