package gerrymandering.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import utils.ElectionType;
import utils.PartyName;

@Entity
@Table(name = "ELECTION_DATA")
public class ElectionData implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "ELECTION_ID")
	private int electionId;
	
	@Column(name = "REPRESENTATIVE_ID")
	private int representativeId;
	
	@Column(name = "PARTY_NAME")
	private PartyName partyName;
	
	@Column(name = "ELECTION_TYPE")
	private ElectionType electionType;
	
	@Column(name = "VOTE_COUNT")
	private double voteCount;
	
	@Column(name = "PRECINCT_ID")
	private int precinctId;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;
	
	@Column(name = "ELECTION_DATE")
	private Date electionDate;

	public ElectionData(int representativeId, PartyName partyName, ElectionType electionType, double voteCount,
			int precinctId, int districtId, Date electionDate) {
		this.representativeId = representativeId;
		this.partyName = partyName;
		this.electionType = electionType;
		this.voteCount = voteCount;
		this.precinctId = precinctId;
		this.districtId = districtId;
		this.electionDate = electionDate;
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

	public PartyName getPartyName() {
		return partyName;
	}

	public void setPartyName(PartyName partyName) {
		this.partyName = partyName;
	}

	public ElectionType getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionType electionType) {
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

	public ElectionData() {}
}
