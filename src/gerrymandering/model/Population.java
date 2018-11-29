package gerrymandering.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POPULATION")
public class Population implements java.io.Serializable, RemarkObject{
	@Id @GeneratedValue
	@Column(name = "POPULATION_ID")
	private int populationId;
	
	private Date date;
	private double population;
	
	@Column(name = "PRECINCT_ID")
	private int precinctId;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;
	
	@Column(name = "EXTERNAL_ID")
	private String externalId;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public Population(Date date, double population, int precinctId, int districtId, String teamName, String remarks) {
		this(date, population, precinctId, districtId, teamName);
		this.remarks = remarks;
	}
	
	public Population(Date date, double population, int precinctId, int districtId, String teamName) {
		this(date, population, precinctId, districtId);
		this.teamName = teamName;
	}

	private Population(Date date, double population, int precinctId, int districtId) {
		this.date = date;
		this.population = population;
		this.precinctId = precinctId;
		this.districtId = districtId;
	}
	
	public Population(String teamName) {
		this.teamName = teamName;
	}
	
	private Population() {
		// TODO Auto-generated constructor stub
	}

	public int getPopulationId() {
		return populationId;
	}

	public void setPopulationId(int populationId) {
		this.populationId = populationId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
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
