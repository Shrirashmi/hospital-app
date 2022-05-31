package hospital_app.controller_medOrder;

import hospital_app.dto.MedOrder;
import hospital_app.dto.Observation;
import hospital_app.service.MedOrderService;
import hospital_app.service.ObservationService;

public class TestGetMedOrderById {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		MedOrder medOrder  = medOrderService.getMedOrderById(1);
		
		if(medOrder!=null) {
			System.out.println("MedOrder id: " + medOrder.getMedOrderId());
			System.out.println("Description: " + medOrder.getDescription());
			System.out.println("NoOfItems given: " + medOrder.getItems().size());
		}
		else {
			System.out.println("Observation Id not found");
		}
	}
}
