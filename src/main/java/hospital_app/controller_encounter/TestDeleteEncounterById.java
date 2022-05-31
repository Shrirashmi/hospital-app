package hospital_app.controller_encounter;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestDeleteEncounterById {
	public static void main(String[] args) {
		EncounterService encounterService =new EncounterService();
		boolean a = encounterService.deleteEncounterById(6);
		if(a) {
			System.out.println("Encounter deleted");
		}
		else {
			System.out.println("No Encounter with this id");
		}
	}
}
