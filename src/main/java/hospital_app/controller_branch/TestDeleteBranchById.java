package hospital_app.controller_branch;

import hospital_app.service.BranchService;

public class TestDeleteBranchById {
	public static void main(String[] args) {
		BranchService branchService = new BranchService();
		boolean a = branchService.deleteBranchById(5);
		if(a) {
			System.out.println("Branch is removed");
		}
		else {
			System.out.println("No branch with such id");
		}
	}
}
