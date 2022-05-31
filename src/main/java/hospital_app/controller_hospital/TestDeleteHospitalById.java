package hospital_app.controller_hospital;

import hospital_app.service.HospitalService;

public class TestDeleteHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		boolean a = hospitalService.deleteHospitalById(2);
		if(a) {
			System.out.println("Hospital deleted");
		}
		else {
			System.out.println("No hospital with such id");
		}
	}
}
