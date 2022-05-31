package hospital_app.controller_address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		Address	address = addressService.getAddressById(1);
		if(address!=null) {
			System.out.println("Branch name: " + address.getBranch().getName());
			System.out.println(address);
		}
		else {
			System.out.println("No Branch exists with the provided ID");
		}
	}
}
