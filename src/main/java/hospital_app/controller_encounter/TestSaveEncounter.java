package hospital_app.controller_encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestSaveEncounter {
	public static void main(String[] args) {
		EncounterService encounterService = new EncounterService();
		Encounter encounter = new Encounter();
		encounter.setAdmitDateTime(LocalDateTime.now());
		//encounter.setDischargeDateTime(LocalDateTime.now());
		encounter.setReason("Fever");
		Encounter encounter2 = encounterService.saveEncounter(1,3, encounter);
		if(encounter2!=null) {
			System.out.println("Encounter saved");
		}
		else {
			System.out.println("Encounter not saved");
		}
	}
}
