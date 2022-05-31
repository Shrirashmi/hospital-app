package hospital_app.service;

import java.util.List;

public interface EncounterInterfaceService {
	public abstract EncounterInterfaceService saveEncounter(int branchId, int personId, EncounterInterfaceService encounter);
	public abstract EncounterInterfaceService getEncounterById(int branchId, int personId, int encounterId);
	public abstract boolean deleteEncounterById(int branchId, int personId, int encounterId);
	public abstract List<EncounterInterfaceService> getAllEncountersByIdPersonId(int personId);
	public abstract List<EncounterInterfaceService> getAllEncounterByBranchId(int branchId);
	public abstract EncounterInterfaceService updateEncounterById(int branchId, int personId, int encounterId, EncounterInterfaceService encounter);
}
