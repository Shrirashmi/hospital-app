package hospital_app.controller_observation;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class TestSaveObservation {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		Observation observation = new Observation();
		observation.setDateTime(LocalDateTime.now());
		observation.setDescription("fever");
		Observation observation2 = observationService.saveObservation(1, observation);
		if(observation2!=null) {
			System.out.println("Observation entered");
		}
		else {
			System.out.println("Observation not entered");
		}
	}
}
