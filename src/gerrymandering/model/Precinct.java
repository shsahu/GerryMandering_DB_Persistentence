package gerrymandering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;

import utils.Validator;

@Entity
@Table(name = "PRECINCTS")
public class Precinct implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name = "PRECINCT_ID")
	private int precinctId;
	
	@Column(name = "CENTER_POINT")
	private String centerPointJSON;
	
	@Column(name = "BOUNDARY")
	private String boundaryJSON;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;
	
	@Column(name = "EXTERNAL_ID")
	private String externalId;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public Precinct(int districtId, String centerPointJSON, String boundaryJSON, String teamName, String remarks) throws Exception {
		this(districtId, centerPointJSON, boundaryJSON, teamName);
		this.remarks = remarks;
	}
	
	public Precinct(int districtId, String centerPointJSON, String boundaryJSON, String teamName) throws Exception {
		this(districtId, centerPointJSON, boundaryJSON);
		this.teamName = teamName;
	}

	private Precinct(int districtId, String centerPointJSON, String boundaryJSON) throws Exception {
		
		if(!Validator.isJSONValid(boundaryJSON))
			throw new Exception("boundaryJSON value is not a valid JSON");
		if(!Validator.isJSONValid(boundaryJSON))
			throw new Exception("centerPointJSON value is not a valid JSON");
		this.centerPointJSON = centerPointJSON;
		this.boundaryJSON = boundaryJSON;
		this.districtId = districtId;
	}
	
	public Precinct(String teamName) {
		this.teamName = teamName;
	}
	
	private Precinct() {}

	public int getPrecinctId() {
		return precinctId;
	}

	public void setPrecinctId(int precinctId) {
		this.precinctId = precinctId;
	}

	public String getCenterPointJSON() {
		return centerPointJSON;
	}

	public void setCenterPointJSON(String centerPointJSON) {
		this.centerPointJSON = centerPointJSON;
	}

	public String getBoundaryJSON() {
		return boundaryJSON;
	}

	public void setBoundary(String boundaryJSON) {
		this.boundaryJSON = boundaryJSON;
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
