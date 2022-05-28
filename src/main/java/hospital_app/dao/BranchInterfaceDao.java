package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Branch;

public interface BranchInterfaceDao {
	public abstract Branch saveBranch(Branch branch, int hospitalId);
	public abstract Branch getBranchById(int branchId);
	public abstract Branch getBranchByName(String name);
	public abstract Branch updateBranchById(int branchId, Branch branch);
	public abstract boolean deleteBranchById(int branchId);
	public abstract List<Branch> getAllBranchesByHospitalId(int hospitalId);
}
