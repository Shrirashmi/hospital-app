package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String name;
	private String email;
	private long phone;
	private int noOfStaff;
	@OneToOne
	private Address address;
	@ManyToOne
	private Hospital hospital;
	@OneToMany
	private List<Encounter> encounters;
	//private List<User> users;
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public List<Encounter> getEncounters() {
		return encounters;
	}
	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}	
}
