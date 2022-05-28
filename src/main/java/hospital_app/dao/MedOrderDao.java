package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class MedOrderDao implements MedOrderInterfaceDao {

	public MedOrder saveMedOrder(int encounterId, MedOrder medOrder) {
		return null;
	}

	public MedOrder getMedOrderById(int medOrderId) {
		return null;
	}

	public List<MedOrder> getAllMedOrdersByEncounterId(int encounterId) {
		return null;
	}

	public MedOrder updateMedOrderById(int medOrderId, MedOrder medOrder) {
		return null;
	}

	public double totalBill(List<Item> items) {
		return 0;
	}

}
