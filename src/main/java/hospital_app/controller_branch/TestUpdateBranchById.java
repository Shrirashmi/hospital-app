package hospital_app.controller_branch;

import hospital_app.dto.Branch;
import hospital_app.service.BranchService;

public class TestUpdateBranchById {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		Branch branch = new Branch();
		branch.setPhone(894567898);
		branch.setNoOfStaff(36);
		Branch branch2 = branchService.updateBranchById(11, branch);
		if(branch2!=null) {
			System.out.println("Branch is updated");
		}
		else {
			System.out.println("Branch not updated");
		}
	}
}
