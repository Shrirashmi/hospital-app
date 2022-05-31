package hospital_app.controller_observation;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class TestGetObservationById {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		Observation observation = observationService.getObservationById(5);
		if(observation!=null) {
			System.out.println("Observation id: " + observation.getObservationId());
			System.out.println("Description: " + observation.getDescription());
			System.out.println("Date and time: " + observation.getDateTime());
			System.out.println("Observation of the encounter id: " + observation.getEncounter().getEncounterId());
		}
		else {
			System.out.println("Observation Id not found");
		}
	}
}
