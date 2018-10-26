package utils;

public class PartyRepresentative {

	private int representativeId;
	private String name;
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

	public PartyRepresentative(int representativeId, String name, String address) {
		this.representativeId = representativeId;
		this.name = name;
		this.address = address;
	}

	public PartyRepresentative() {
		// TODO Auto-generated constructor stub
	}
}
