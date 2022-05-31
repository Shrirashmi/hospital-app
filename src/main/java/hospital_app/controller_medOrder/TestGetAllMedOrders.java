package hospital_app.controller_medOrder;

import java.util.List;

import hospital_app.dto.MedOrder;
import hospital_app.dto.Person;
import hospital_app.service.MedOrderService;
import hospital_app.service.ObservationService;
import hospital_app.service.PersonService;

public class TestGetAllMedOrders {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		List<MedOrder> medOrders = medOrderService.getAllMedOrdersById(1);
		if (medOrders.size() > 0) {
			for (MedOrder medOrder : medOrders) {
				System.out.println("MedOrder id: " + medOrder.getMedOrderId());
				System.out.println("Description: " + medOrder.getDescription());
				System.out.println("Reason: " + medOrder.getEncounter().getReason());
				System.out.println("MedOrder of the encounter id: " + medOrder.getEncounter().getEncounterId());
			}
		}
		else {
			System.out.println("No MedOrder for the provided id");
		}
	}
}
