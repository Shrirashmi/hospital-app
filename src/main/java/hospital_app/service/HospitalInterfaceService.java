package hospital_app.service;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public interface HospitalInterfaceService {
	public abstract Hospital saveHospital(Hospital hospital);
	public abstract Hospital getHospitalById(int hospitalId);
	public abstract Hospital getHospitalByName(String name);
	public abstract Hospital updateHospitalById(int hospitalId, Hospital hospital);
	public abstract boolean deleteHospitalById(int hospitalId);
	public abstract List<Hospital> getAllHospitals();
}
