package hospital_app.controller_encounter;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestGetEncounterById {
	public static void main(String[] args) {
		EncounterService encounterService = new EncounterService();
		Encounter encounter = encounterService.getEncounterById(1);

		if (encounter != null) {
			System.out.println(encounter.getEncounterId());
			System.out.println(encounter.getReason());
			System.out.println(encounter.getAdmitDateTime());
			System.out.println(encounter.getDischargeDateTime());
			System.out.println("Person name: " + encounter.getPerson().getName());
			System.out.println("Encountered branch: " + encounter.getBranch().getName());
		} else {
			System.out.println("No encounters with this id");
		}
	}
}
