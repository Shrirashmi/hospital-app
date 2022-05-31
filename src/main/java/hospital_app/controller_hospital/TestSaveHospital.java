package hospital_app.controller_hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Rainbow");
		hospital.setGstNo("1RBW0");
		hospital.setWebsite("www.rainbow.com");

		HospitalService hospitalService = new HospitalService();
		Hospital hospital2 = hospitalService.saveHospital(hospital);
		if (hospital2 != null) {
			System.out.println("Hospital data inserted");
		} else {
			System.out.println("Hospital data not inserted");
		}
	}
}
