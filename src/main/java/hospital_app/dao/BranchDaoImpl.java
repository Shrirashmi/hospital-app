package hospital_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class BranchDaoImpl implements BranchInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch, int hospitalId) {

		Hospital hospital = entityManager.find(Hospital.class, hospitalId);
		branch.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return entityManager.find(Branch.class, branch.getBranchId());

	}

	public Branch getBranchById(int branchId) {
		return entityManager.find(Branch.class, branchId);
	}

	public Branch getBranchByName(String name) {
		String sql = "SELECT b FROM Branch b WHERE b.name = ?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		try {
			Branch branch = (Branch) query.getSingleResult();
			return branch;
		} catch (NoResultException e) {
			System.out.println("No Result Exception");
		}
		return null;
	}

	public Branch updateBranchById(int branchId, Branch branch) {
		Branch branch2 = entityManager.find(Branch.class, branchId);

		if (branch.getEmail() != null) {
			branch2.setEmail(branch.getEmail());
		}
		if (branch.getName() != null) {
			branch2.setName(branch.getName());
		}
		if (branch.getNoOfStaff() != 0) {
			branch2.setNoOfStaff(branch.getNoOfStaff());
		}
		if (branch.getPhone() != 0) {
			branch2.setPhone(branch.getPhone());
		}
		if (branch != null) {
			branch2.setBranchId(branchId);
			branch2.setHospital(branch2.getHospital());
			entityTransaction.begin();
			entityManager.merge(branch2);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getBranchId());
		} else {
			return null;
		}
	}

	public boolean deleteBranchById(int branchId) {
		Branch branch = entityManager.find(Branch.class, branchId);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public List<Branch> getAllBranchesByHospitalId(int hospitalId) {
		Query query = entityManager.createQuery("SELECT b FROM Branch b WHERE b.hospital.hospitalId=?1");
		query.setParameter(1, hospitalId);
		List<Branch> branches = query.getResultList();
		return branches;
	}

}
