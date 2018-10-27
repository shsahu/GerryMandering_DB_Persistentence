package gerrymandering.model;

import utils.Validator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISTRICTS")
public class District implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "DISTRICT_ID")
	private int districtId;
	
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "BOUNDARY")
	private String boundaryJSON;
	
	public District(int stateId, String name, String boundaryJSON)  throws Exception{
		if(!Validator.isJSONValid(boundaryJSON))
			throw new Exception("boundaryJSON value is not a valid JSON");
		this.stateId = stateId;
		this.name = name;
		this.boundaryJSON = boundaryJSON;
	}
	public District() {}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoundary() {
		return boundaryJSON;
	}

	public void setBoundary(String boundaryJSON) {
		this.boundaryJSON = boundaryJSON;
	}
}
