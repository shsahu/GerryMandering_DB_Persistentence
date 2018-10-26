package gerrymandering.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATES")
public class State implements java.io.Serializable{
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
	
	public State(String name, String shortName, String constitutionText) {
		this.name = name;
		this.shortName = shortName;
		this.constitutionText = constitutionText;
	}
	public State() {	}

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
}

