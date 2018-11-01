import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import gerrymandering.HibernateManager;
import gerrymandering.model.District;
import gerrymandering.model.ElectionData;
import gerrymandering.model.PartyRepresentative;
import gerrymandering.model.Precinct;
import gerrymandering.model.State;
import utils.ElectionType;
import utils.PartyName;

public class Main {
	public static void main(String[] args) {
		boolean result= false;
		List<Object> l;
		Iterator<Object> itr;
		try {
			HibernateManager hb = HibernateManager.getInstance();	
			
			State state = new State();
			state.setShortName("NY");
			//to get all existing states and check for presence of a given state.
			l =hb.getAllRecords(State.class);
			itr = l.iterator();
			while (itr.hasNext()) {
				State s = (State) itr.next();
				System.out.print(s.getStateId()+" ");
				System.out.print(s.getName()+ " ");
				System.out.print(s.getShortName()+" ");
				System.out.print(s.getConstitutionText()+" ");
				System.out.println();
				
				if(s.getShortName().equals(state.getShortName())) {
					System.out.println("State " + s.getName() +" already exists");
					state = s;
				}
			}
			//if state is not found in DB
			if(state.getStateId() == 0) {
				// add new state
				String text = "Constitution Text";
				state = new State("New York","NY",text);
				result = hb.persistToDB(state);
			}
			
			//to get all districts
			l =hb.getAllRecords(District.class);
			itr = l.iterator();
			while (itr.hasNext()) {
				District emp = (District) itr.next();
				System.out.print(emp.getDistrictId()+" ");
				System.out.print(emp.getStateId()+" ");
				System.out.print(emp.getName()+ " ");
				System.out.print(emp.getBoundary()+" ");
				System.out.println();
			}
			
			// to get all districts in given state you need to pass stateid
			Map<String,Object> criteria = new HashMap<>();
			criteria.put("stateId",state.getStateId());
			//multiple criteria can be added
			//criteria.put("name","D1"); 
			l = hb.getRecordsBasedOnCriteria(District.class,criteria);
			itr = l.iterator();
			while (itr.hasNext()) {
				District emp = (District) itr.next();
				System.out.print(emp.getDistrictId()+" ");
				System.out.print(emp.getStateId()+" ");
				System.out.print(emp.getName()+ " ");
				System.out.print(emp.getBoundary()+" ");
				System.out.println();
			}
		
			//to add new District in a state
			String boundaryJson = "[{'x': '0', 'y': '0'}, {'x': '1', 'y': '1'}]";
			District d = new District(state.getStateId(),"Brooklyn",boundaryJson);
			result = hb.persistToDB(d);
			
			//to add new Precinct in a district
			boundaryJson = "[{'x': '0', 'y': '0'}, {'x': '1', 'y': '1'}]";
			String centrePoint = "{x:0,y:0}";
			Precinct p = new Precinct(d.getDistrictId(),centrePoint,boundaryJson);
			result = hb.persistToDB(p);
			
			hb.persistToDB(new PartyRepresentative("John","Brooklyn"));
			java.sql.Date jsqlD = java.sql.Date.valueOf( "2010-01-31" );
			ElectionData ed = new ElectionData(1,PartyName.Democratic,ElectionType.Congress, 1001, 1, 10, jsqlD);
			hb.persistToDB(ed);
			
		} catch (Throwable e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}finally {
			if(result)
				System.out.println("success");
		}				
	}
}
