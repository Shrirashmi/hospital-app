package hospital_app.controller_hospital;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestGetAllHospitals {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		List<Hospital> hospitals = hospitalService.getAllHospitals();
		if(hospitals.size()>0) {
			for(Hospital hospital : hospitals) {
				System.out.println("Hospital Name: " + hospital.getName());
				System.out.println("Website: " + hospital.getWebsite());
				System.out.println("Gst No: " + hospital.getGstNo());
				System.out.println("------------------------------------");
		}
	}
		else {
			System.out.println("No hospitals to display");
		}
	}
}
