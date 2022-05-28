package hospital_app.service;

import java.util.List;

import hospital_app.dao.EncounterInterfaceDao;

public class EncounterService {
	public EncounterInterfaceDao saveEncounter(int branchId, int personId, EncounterInterfaceDao encounter) {
		return null;
	}

	public EncounterInterfaceDao getEncounterById(int branchId, int personId, int encounterId) {
		return null;
	}

	public boolean deleteEncounterById(int branchId, int personId, int encounterId) {
		return false;
	}

	public List<EncounterInterfaceDao> getAllEncountersByIdPersonId(int personId) {
		return null;
	}

	public List<EncounterInterfaceDao> getAllEncounterByBranchId(int branchId) {
		return null;
	}

	public EncounterInterfaceDao updateEncounterById(int branchId, int personId, int encounterId,
			EncounterInterfaceDao encounter) {
		return null;
	}
}
