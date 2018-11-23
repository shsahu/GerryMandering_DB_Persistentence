package gerrymandering.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Enumerated(EnumType.STRING)
	@Column(name = "PARTY_NAME")
	private PartyName partyName;
	
	@Enumerated(EnumType.STRING)
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
	
	@Column(name = "EXTERNAL_ID")
	private String externalId;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public ElectionData(int representativeId, PartyName partyName, ElectionType electionType, double voteCount,
			int precinctId, int districtId, Date electionDate, String teamName, String remarks) {
		this(representativeId, partyName, electionType, voteCount, precinctId, districtId, electionDate, teamName);
		this.remarks = remarks;
	}
	
	public ElectionData(int representativeId, PartyName partyName, ElectionType electionType, double voteCount,
			int precinctId, int districtId, Date electionDate, String teamName) {
		this(representativeId, partyName, electionType, voteCount, precinctId, districtId, electionDate);
		this.teamName = teamName;
	}
	
	private ElectionData(int representativeId, PartyName partyName, ElectionType electionType, double voteCount,
			int precinctId, int districtId, Date electionDate) {
		this.representativeId = representativeId;
		this.partyName = partyName;
		this.electionType = electionType;
		this.voteCount = voteCount;
		this.precinctId = precinctId;
		this.districtId = districtId;
		this.electionDate = electionDate;
	}
	
	public ElectionData(String teamName) {
		this.teamName = teamName;
	}
	
	private ElectionData() {}

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
