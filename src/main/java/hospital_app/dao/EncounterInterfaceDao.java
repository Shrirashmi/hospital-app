package hospital_app.dao;

import java.util.List;

public interface EncounterInterfaceDao {
	public abstract EncounterInterfaceDao saveEncounter(int branchId, int personId, EncounterInterfaceDao encounter);
	public abstract EncounterInterfaceDao getEncounterById(int branchId, int personId, int encounterId);
	public abstract boolean deleteEncounterById(int branchId, int personId, int encounterId);
	public abstract List<EncounterInterfaceDao> getAllEncountersByIdPersonId(int personId);
	public abstract List<EncounterInterfaceDao> getAllEncounterByBranchId(int branchId);
	public abstract EncounterInterfaceDao updateEncounterById(int branchId, int personId, int encounterId, EncounterInterfaceDao encounter);
}
