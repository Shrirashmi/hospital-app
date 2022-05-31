package hospital_app.service;

import java.util.List;

import hospital_app.dto.Observation;

public interface ObservationInterfaceService {
	public abstract Observation saveObservation(int encounterId, Observation observation);
	public abstract Observation getObservationById(int observationId);
	public abstract Observation updateObservationById(int observationId, Observation observation);
	public abstract List<Observation> getAllObservationsByEncounterId(int encounterId);
}
