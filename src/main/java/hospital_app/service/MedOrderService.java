package hospital_app.service;

import java.util.List;

import hospital_app.dao.MedOrderDaoImpl;
import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;

public class MedOrderService {
	MedOrderDaoImpl dao = new MedOrderDaoImpl();
	public MedOrder saveMedOrder(int encounterId, MedOrder medOrder) {
		return dao.saveMedOrder(encounterId, medOrder);
	}

	public MedOrder getMedOrderById(int medOrderId) {
		return dao.getMedOrderById(medOrderId);
	}

	public List<MedOrder> getAllMedOrdersById(int medOrderId) {
		return dao.getAllMedOrdersById(medOrderId);
	}

	public MedOrder updateMedOrderById(int medOrderId, MedOrder medOrder) {
		return dao.updateMedOrderById(medOrderId, medOrder);
	}
	
	public boolean deleteMedOrderById(int medOrderId) {
		return dao.deleteMedOrderById(medOrderId);
	}
}	
