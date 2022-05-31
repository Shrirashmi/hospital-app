package hospital_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class AddressDaoImpl implements AddressInterfaceDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shri");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Address saveAddress(Address address, int branchId) {
		Branch branch = entityManager.find(Branch.class, branchId);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return entityManager.find(Address.class, address.getAddressId());
	}

	public Address getAddressById(int addressId) {
		return entityManager.find(Address.class, addressId);
	}

	public Address updateAddressById(int addressId, Address address) {
		Address address2 = entityManager.find(Address.class, addressId);
		if(address.getBranch()!=null) {
			address2.setBranch(address.getBranch());
		}
		if(address.getCity()!=null) {
			address2.setCity(address.getCity());
		}
		if(address.getCountry()!=null) {
			address2.setCountry(address.getCountry());
		}
		if(address.getPincode()!=0) {
			address2.setPincode(address.getPincode());
		}
		if(address.getState()!=null) {
			address2.setState(address.getState());
		}
		if(address.getStreet()!=null) {
			address2.setStreet(address.getStreet());
		}
		if (address != null) {
			entityTransaction.begin();
			address2.setAddressId(addressId);
			//address2.setBranch(address.getBranch());
			entityManager.merge(address2);
			entityTransaction.commit();
			return entityManager.find(Address.class, address.getAddressId());
		} else {
			return null;
		}
	}
}
