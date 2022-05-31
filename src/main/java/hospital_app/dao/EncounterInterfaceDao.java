package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Encounter;

public interface EncounterInterfaceDao {
	public abstract Encounter saveEncounter(int branchId, int personId, Encounter encounter);
	public abstract Encounter getEncounterById(int encounterId);
	public abstract boolean deleteEncounterById(int encounterId);
	public abstract List<Encounter> getAllEncountersByIdPersonId(int personId);
	public abstract List<Encounter> getAllEncounterByBranchId(int branchId);
	public abstract Encounter updateEncounterById(int encounterId, Encounter encounter);
}
