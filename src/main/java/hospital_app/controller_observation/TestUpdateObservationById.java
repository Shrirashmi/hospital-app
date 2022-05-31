package hospital_app.controller_observation;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.ObservationService;

public class TestUpdateObservationById {
	public static void main(String[] args) {
		ObservationService observationService = new ObservationService();
		Observation observation = new Observation();
		observation.setDateTime(LocalDateTime.now());
		observation.setDescription("fh");
		observationService.updateObservationById(1, observation);
	}
}
