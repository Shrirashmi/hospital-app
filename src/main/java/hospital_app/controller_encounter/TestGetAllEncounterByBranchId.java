package hospital_app.controller_encounter;

import java.util.List;

import hospital_app.dto.Encounter;
import hospital_app.service.EncounterService;

public class TestGetAllEncounterByBranchId {
	public static void main(String[] args) {
		EncounterService encounterService = new EncounterService();
		List<Encounter> encounters = encounterService.getAllEncounterByBranchId(1);
		if (encounters.size() > 0) {
			for (Encounter encounter : encounters) {
				System.out.println("Branch name: " + encounter.getBranch().getName());
				System.out.println("Person name: " + encounter.getPerson().getName());
				System.out.println("Encounter ID: " + encounter.getEncounterId());
				System.out.println("Reason: " + encounter.getReason());
				System.out.println("Admit Date Time: " + encounter.getAdmitDateTime());
				System.out.println("Discharge Date Time: " + encounter.getDischargeDateTime());
				System.out.println("--------------------------------");
			}
		} else {
			System.out.println("No encounters with this personId");
		}
	}
}
