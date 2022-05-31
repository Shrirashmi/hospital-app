package hospital_app.controller_branch;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestGetAllBranchesByHospitalId {
	public static void main(String[] args) {
	BranchService branchService = new BranchService();
	List<Branch> branches = branchService.getAllBranchesByHospitalId(3);
	for(Branch branch : branches) {
		System.out.println("Branch Id: " + branch.getBranchId());
		System.out.println("Branch Name: " + branch.getName());
		System.out.println("Email: " + branch.getEmail());
		System.out.println("Phone: " + branch.getPhone());
		System.out.println("No Of Staff: " + branch.getNoOfStaff());
		System.out.println("Hospital: " + branch.getHospital().getName());
		System.out.println("----------------------------------------");
	}
	}
}
