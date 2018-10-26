package utils;

import java.util.Date;

public class Population {

	private int poputationId;
	private Date date;
	private double population;
	private int precinctId;
	private int districtId;

	public Population(int poputationId, Date date, double population, int precinctId, int districtId) {
		this.poputationId = poputationId;
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
