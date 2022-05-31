package hospital_app.service;

import hospital_app.dto.Address;

public interface AddressInterfaceService {
	public abstract Address saveAddress(Address address, int branchId);
	public abstract Address getAddressById(int addressId);
	public abstract Address updateAddressById(int addressId, Address address);
}
