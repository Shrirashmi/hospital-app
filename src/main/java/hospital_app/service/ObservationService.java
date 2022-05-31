package hospital_app.service;

import java.util.List;

import hospital_app.dao.ObservationDaoImpl;
import hospital_app.dto.Observation;

public class ObservationService {
	ObservationDaoImpl dao = new ObservationDaoImpl();
	public Observation saveObservation(int encounterId, Observation observation) {
		return dao.saveObservation(encounterId, observation);
	}

	public Observation getObservationById(int observationId) {
		return dao.getObservationById(observationId);
	}

	public Observation updateObservationById(int observationId, Observation observation) {
		return dao.updateObservationById(observationId, observation);
	}

	public List<Observation> getAllObservationsByEncounterId(int encounterId) {
		return dao.getAllObservationsByEncounterId(encounterId);
	}
}
