package hospital_app.controller_address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;

public class TestUpdateAddressById {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		Address address = new Address();
		address.setStreet("BTM");
		address.setCity("Bangalore");
		address.setState("KA");
		address.setCountry("IND");
		address.setPincode(560067);
		Address address2 = addressService.updateAddressById(1, address);
		if(address2!=null) {
			System.out.println("Address updated");
		}
		else {
			System.out.println("No Address with such id");
		}
	}
}
