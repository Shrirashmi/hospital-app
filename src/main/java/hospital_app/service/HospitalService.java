package hospital_app.service;

import java.util.List;

import hospital_app.dao.HospitalDaoImpl;
import hospital_app.dto.Hospital;

public class HospitalService {
	HospitalDaoImpl dao = new HospitalDaoImpl();
	public Hospital saveHospital(Hospital hospital) {
		return dao.saveHospital(hospital);
	}

	public Hospital getHospitalById(int hospitalId) {
		return dao.getHospitalById(hospitalId);
	}

	public Hospital getHospitalByName(String name) {
		return dao.getHospitalByName(name);
	}

	public Hospital updateHospitalById(int hospitalId, Hospital hospital) {
		return dao.updateHospitalById(hospitalId, hospital);
	}

	public boolean deleteHospitalById(int hospitalId) {
		return dao.deleteHospitalById(hospitalId);
	}

	public List<Hospital> getAllHospitals() {
		return dao.getAllHospitals();
	}
}
