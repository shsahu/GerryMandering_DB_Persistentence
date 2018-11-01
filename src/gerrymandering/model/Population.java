package gerrymandering.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELECTION_DATA")
public class Population implements java.io.Serializable{
	@Id @GeneratedValue
	@Column(name = "POPULATION_ID")
	private int poputationId;
	
	private Date date;
	private double population;
	
	@Column(name = "PRECINCT_ID")
	private int precinctId;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;

	public Population(Date date, double population, int precinctId, int districtId) {
		this.date = date;
		this.population = population;
		this.precinctId = precinctId;
		this.districtId = districtId;
	}

	public int getPoputationId() {
		return poputationId;
	}

	public void setPoputationId(int poputationId) {
		this.poputationId = poputationId;
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

	public Population() {
		// TODO Auto-generated constructor stub
	}
}
