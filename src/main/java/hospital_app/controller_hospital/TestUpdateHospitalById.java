package hospital_app.controller_hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestUpdateHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		//Hospital hospital1=hospitalService.getHospitalById(4);
		Hospital hospital = new Hospital();
		
		hospital.setGstNo("Nitish");
		Hospital hospital2 = hospitalService.updateHospitalById(1,hospital);
		if(hospital2!=null) {
			System.out.println("Hospital details Updated");
		}
		else {
			System.out.println("No hospital to update");
		}
	}
}
