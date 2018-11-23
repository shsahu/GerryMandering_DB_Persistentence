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
	
	@Column(name = "EXTERNAL_ID")
	private String externalId;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public PartyRepresentative(String name, String address, String teamName, String remarks) {
		this(name, address, teamName);
		this.remarks = remarks;
	}
	
	public PartyRepresentative(String name, String address, String teamName) {
		this(name, address);
		this.teamName = teamName;
	}
	
	private PartyRepresentative(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public PartyRepresentative(String teamName) {
		this.teamName = teamName;
	}

	private PartyRepresentative() {}
	

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
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
