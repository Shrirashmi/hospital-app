package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Observation;

public interface ObservationInterfaceDao {
	public abstract Observation saveObservation(int encounterId, Observation observation);
	public abstract Observation getObservationById(int observationId);
	public abstract Observation updateObservationById(int observationId);
	public abstract List<Observation> getAllObservationsByEncounterId(int encounterId);
}
