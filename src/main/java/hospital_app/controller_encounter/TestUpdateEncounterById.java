package hospital_app.controller_encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestUpdateEncounterById {
	public static void main(String[] args) {
		EncounterService encounterService = new EncounterService();
		Encounter encounter = new Encounter();
		encounter.setDischargeDateTime(LocalDateTime.now());
		Encounter encounter2 = encounterService.updateEncounterById(3, encounter);
		if(encounter2!=null) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not updated, provided id is not matching");
		}
	}
}
