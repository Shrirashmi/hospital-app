package hospital_app.controller_hospital;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestGetHospitalByName {
	public static void main(String[] args) {

		HospitalService hospitalService = new HospitalService();
		Hospital hospital = hospitalService.getHospitalByName("Appollo");
		if (hospital != null) {
			System.out.println("Hospital Name: " + hospital.getName());
			System.out.println("Website: " + hospital.getWebsite());
			System.out.println("Gst No: " + hospital.getGstNo());
		} else {
			System.out.println("No hospital with such name");
		}
	}
}
