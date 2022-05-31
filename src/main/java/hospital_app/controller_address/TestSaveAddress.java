package hospital_app.controller_address;

import hospital_app.dto.Address;
import hospital_app.service.AddressService;

public class TestSaveAddress {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		Address address = new Address();
		address.setStreet("KMC");
		address.setCity("Mangalore");
		address.setState("KA");
		address.setPincode(500567);
		address.setCountry("IND");
		Address address2 = addressService.saveAddress(address, 11);
		if(address2!=null) {
			System.out.println("Address saved for the branch");
		}
		else {
			System.out.println("Address not saved");
		}
	}
}
