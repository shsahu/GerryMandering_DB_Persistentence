package gerrymandering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATES")
public class State implements java.io.Serializable, RemarkObject{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SHORT_NAME")
	private String shortName;
	
	@Column(name = "CONSTITUTION_TEXT")
	private String constitutionText;
	
	@Column(name = "EXTERNAL_ID")
	private String externalId;
	
	@Column(name = "TEAM_NAME")
	private String teamName;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	public State(String name, String shortName, String constitutionText, String teamName, String remarks) {
		this(name, shortName, constitutionText, teamName);
		this.remarks = remarks;
	}
	
	public State(String name, String shortName, String constitutionText, String teamName) {
		this(name, shortName, constitutionText);
		this.teamName = teamName;
	}
	
	private State(String name, String shortName, String constitutionText) {
		this.name = name;
		this.shortName = shortName;
		this.constitutionText = constitutionText;
	}
	
	public State(String teamName) {
		this.teamName = teamName;
	}
	
	private State() {}

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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getConstitutionText() {
		return constitutionText;
	}
	public void setConstitutionText(String constitutionText) {
		this.constitutionText = constitutionText;
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

