package utils;

public class ElectionData {
	
	private int electionId;
	private int representativeId;
	private String partyName;
	private String electionType;
	private double voteCount;
	private int precinctId;
	private int districtId;

	public ElectionData(int electionId, int representativeId, String partyName, String electionType, double voteCount,
			int precinctId, int districtId) {
		this.electionId = electionId;
		this.representativeId = representativeId;
		this.partyName = partyName;
		this.electionType = electionType;
		this.voteCount = voteCount;
		this.precinctId = precinctId;
		this.districtId = districtId;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public int getRepresentativeId() {
		return representativeId;
	}

	public void setRepresentativeId(int representativeId) {
		this.representativeId = representativeId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getElectionType() {
		return electionType;
	}

	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}

	public double getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(double voteCount) {
		this.voteCount = voteCount;
	}

	public int getPrecinctId() {
		return precinctId;
	}

	public void setPrecinctId(int precinctId) {
		this.precinctId = precinctId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public ElectionData() {
		// TODO Auto-generated constructor stub
	}
}
