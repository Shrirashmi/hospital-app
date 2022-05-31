package hospital_app.controller_branch;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestGetBranchById {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		Branch branch = branchService.getBranchById(11);
		if(branch!=null) {
			System.out.println("Branch Name: " + branch.getName());
			System.out.println("Email: " + branch.getEmail());
			System.out.println("Phone: " + branch.getPhone());
			System.out.println("No Of Staff: " + branch.getNoOfStaff());
			System.out.println("Hospital: " + branch.getHospital().getName());
			System.out.println("----------------------------------------");
			System.out.println("Address: " + branch.getAddress());
		}
		else {
			System.out.println("No branch with such id");
		}
	}
}
