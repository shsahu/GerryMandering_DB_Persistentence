package gerrymandering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARTY_REPRESENTATIVE")
public class PartyRepresentative implements java.io.Serializable{

	@Id @GeneratedValue
	@Column(name = "REPRESENTATIVE_ID")
	private int representativeId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String address;

	public int getRepresentativeId() {
		return representativeId;
	}

	public void setRepresentativeId(int representativeId) {
		this.representativeId = representativeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PartyRepresentative(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public PartyRepresentative() {}
}
