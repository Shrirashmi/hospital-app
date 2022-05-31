package hospital_app.service;

import java.util.List;

import hospital_app.dao.BranchDaoImpl;
import hospital_app.dto.Branch;

public class BranchService {
	BranchDaoImpl dao = new BranchDaoImpl();

	public Branch saveBranch(Branch branch, int hospitalId) {
		return dao.saveBranch(branch, hospitalId);
	}

	public Branch getBranchById(int branchId) {
		return dao.getBranchById(branchId);
	}

	public Branch getBranchByName(String name) {
		return dao.getBranchByName(name);
	}

	public Branch updateBranchById(int branchId, Branch branch) {
		return dao.updateBranchById(branchId, branch);
	}

	public boolean deleteBranchById(int branchId) {
		return dao.deleteBranchById(branchId);
	}

	public List<Branch> getAllBranchesByHospitalId(int hospitalId) {
		return dao.getAllBranchesByHospitalId(hospitalId);
	}
}
