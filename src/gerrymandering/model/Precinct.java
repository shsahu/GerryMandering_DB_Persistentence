package gerrymandering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;

@Entity
@Table(name = "PRECINCTS")
public class Precinct implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name = "PRECINCT_ID")
	private int precinctId;
	
	@Column(name = "CENTER_POINT")
	private String centerPoint;
	
	@Column(name = "BOUNDARY")
	private String boundary;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;

	public Precinct(String centerPoint, String boundary, int districtId) {
		this.centerPoint = centerPoint;
		this.boundary = boundary;
		this.districtId = districtId;
	}
	
	public Precinct() {}

	public int getPrecinctId() {
		return precinctId;
	}

	public void setPrecinctId(int precinctId) {
		this.precinctId = precinctId;
	}

	public String getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(String centerPoint) {
		this.centerPoint = centerPoint;
	}

	public String getBoundary() {
		return boundary;
	}

	public void setBoundary(String boundary) {
		this.boundary = boundary;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
}
