package hospital_app.controller_hospital;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.HospitalService;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalService hospitalService = new HospitalService();
		Hospital hospital = hospitalService.getHospitalById(1);
		if (hospital != null) {

			System.out.println("Hospital Name: " + hospital.getName());
			System.out.println("Website: " + hospital.getWebsite());
			System.out.println("Gst No: " + hospital.getGstNo());
			List<Branch> branches = hospital.getBranches();
			System.out.println("-----------------------------------------");
			for (Branch branch : branches) {
				System.out.println("Branch Id: " + branch.getBranchId());
				System.out.println("Branch Name: " + branch.getName());
				System.out.println("Email: " + branch.getEmail());
				System.out.println("Phone: " + branch.getPhone());
				System.out.println("No Of Staff: " + branch.getNoOfStaff());
				System.out.println("Address: " + branch.getAddress());
				System.out.println("-------------------------------------");
			}
		} else {
			System.out.println("No hospital with this id");
		}
	}
}
