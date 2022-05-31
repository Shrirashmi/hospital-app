package hospital_app.controller_medOrder;

import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrderService;

public class TestSaveMedOrder {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		MedOrder medOrder = new MedOrder();
		medOrder.setDescription("cough");
		MedOrder medOrder2 = medOrderService.saveMedOrder(1, medOrder);
		if(medOrder2!=null) {
			System.out.println("MedOrder saved");
		}
		else {
			System.out.println("MedOrder not saved");
		}
	}
}
