package hospital_app.controller_branch;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestSaveBranch {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		Branch branch = new Branch();
		branch.setEmail("kims@kims.com");
		branch.setName("Bangalore");
		branch.setPhone(200);
		branch.setNoOfStaff(75);    
		Branch branch2 = branchService.saveBranch(branch, 1);
		if(branch2!=null) {
			System.out.println("Branch added");
		}
		else {
			System.out.println("Branch not added");
		}
	}
}
