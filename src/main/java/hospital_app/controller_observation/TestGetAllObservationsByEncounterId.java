package hospital_app.controller_observation;

import java.util.List;

import hospital_app.dto.Observation;
import hospital_app.dto.Person;
import hospital_app.service.ObservationService;
import hospital_app.service.PersonService;

public class TestGetAllObservationsByEncounterId {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		List<Observation> observations = observationService.getAllObservationsByEncounterId(4);
		if (observations.size() > 0) {
			for (Observation observation : observations) {
				System.out.println("Observation id: " + observation.getObservationId());
				System.out.println("Description: " + observation.getDescription());
				System.out.println("Date and time: " + observation.getDateTime());
				System.out.println("Observation of the encounter id: " + observation.getEncounter().getEncounterId());
			}
		}
	}
}
