package hospital_app.service;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public interface MedOrderInterfaceService {
	public abstract MedOrder saveMedOrder(int encounterId, MedOrder medOrder);
	public abstract MedOrder getMedOrderById(int medOrderId);
	public abstract List<MedOrder> getAllMedOrdersById(int medOrderId);
	public abstract MedOrder updateMedOrderById(int medOrderId, MedOrder medOrder);
	//public abstract double totalBill(List<Item> items);
	public abstract boolean deleteMedOrderById(int medOrder);
	
}
