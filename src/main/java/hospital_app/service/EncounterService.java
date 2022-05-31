package hospital_app.service;

import java.util.List;

import hospital_app.dao.EncounterDaoImpl;
import hospital_app.dao.EncounterInterfaceDao;
import hospital_app.dto.Encounter;

public class EncounterService {
	EncounterDaoImpl dao = new EncounterDaoImpl();
	public Encounter saveEncounter(int branchId, int personId, Encounter encounter) {
		return dao.saveEncounter(branchId, personId, encounter);
	}

	public Encounter getEncounterById(int encounterId) {
		return dao.getEncounterById(encounterId);
	}

	public boolean deleteEncounterById(int encounterId) {
		return dao.deleteEncounterById(encounterId);
	}

	public List<Encounter> getAllEncountersByIdPersonId(int personId) {
		return dao.getAllEncountersByIdPersonId(personId);
	}

	public List<Encounter> getAllEncounterByBranchId(int branchId) {
		return dao.getAllEncounterByBranchId(branchId);
	}

	public Encounter updateEncounterById(int encounterId, Encounter encounter) {
		return dao.updateEncounterById(encounterId, encounter);
	}
}
