package hospital_app.controller_medOrder;

import hospital_app.service.MedOrderService;

public class TestDeleteMedOrderById {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		boolean a = medOrderService.deleteMedOrderById(1);
		if(a) {
			System.out.println("MedOrder deleted");
		}
		else{
			System.out.println("MedOrder not deleted");
		}
	}
}
