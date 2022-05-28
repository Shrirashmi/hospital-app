package hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MedOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medOrderId;
	private String description;
	private double total;
	@OneToMany
	private List<Item> items;
	@ManyToOne
	private Encounter encounter;
	
	public int getMedOrderId() {
		return medOrderId;
	}
	public void setMedOrderId(int medOrderId) {
		this.medOrderId = medOrderId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
}
