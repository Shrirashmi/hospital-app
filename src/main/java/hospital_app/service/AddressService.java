package hospital_app.service;

import hospital_app.dao.AddressDaoImpl;
import hospital_app.dto.Address;

public class AddressService {
	AddressDaoImpl dao = new AddressDaoImpl();

	public Address saveAddress(Address address, int branchId) {
		return dao.saveAddress(address, branchId);
	}

	public Address getAddressById(int addressId) {
		return dao.getAddressById(addressId);
	}

	public Address updateAddressById(int addressId, Address address) {
		return dao.updateAddressById(addressId, address);
	}
}
