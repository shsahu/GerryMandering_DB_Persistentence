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
		String teamName = "team-TA";
		List<Object> l;
		Iterator<Object> itr;
		try {
			HibernateManager hb = HibernateManager.getInstance();	
			
			State state = null;
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
				
				if(s.getShortName().equals("NY")) {
					System.out.println("State " + s.getName() +" already exists");
					state = s;
				}
			}
			//if state is not found in DB
			if(state == null) {
				// add new state
				String text = "Constitution Text";
				state = new State("New York","NY",text,teamName);
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
			String boundaryJson = "[[-74.643395,39.530695],[-74.641857,39.53201],[-74.640344,39.533325999999995],[-74.639816,39.532938],[-74.63933,39.532616],[-74.63929,39.532593],[-74.63875,39.532233],[-74.63820199999999,39.531867999999996],[-74.63793299999999,39.531667],[-74.63768499999999,39.531495],[-74.637164,39.53114],[-74.636623,39.53077],[-74.63606399999999,39.530373],[-74.635499,39.529976],[-74.634941,39.529616],[-74.634377,39.529212],[-74.63428499999999,39.529146],[-74.63390799999999,39.52887],[-74.633723,39.528745],[-74.633335,39.528481],[-74.63286,39.528143],[-74.63163399999999,39.527277999999995],[-74.63050199999999,39.52648],[-74.628908,39.525361],[-74.630421,39.524055],[-74.631967,39.52274],[-74.632908,39.523378],[-74.63324899999999,39.523615],[-74.63376699999999,39.523976],[-74.634027,39.52415],[-74.634283,39.524333],[-74.634874,39.524735],[-74.63542199999999,39.525112],[-74.635941,39.525484999999996],[-74.636473,39.52585],[-74.63680099999999,39.526078999999996],[-74.63698699999999,39.52621],[-74.637391,39.526495],[-74.638036,39.526952],[-74.638556,39.527325],[-74.639135,39.527716],[-74.639707,39.528099],[-74.640236,39.528486],[-74.640766,39.528856],[-74.641273,39.529222999999995],[-74.641536,39.529393],[-74.64182199999999,39.529588],[-74.642331,39.529942999999996],[-74.642872,39.530328999999995],[-74.643395,39.530695]]";
			District d = new District(state.getStateId(),"Brooklyn",boundaryJson,teamName);
			result = hb.persistToDB(d);
			
			//to add new Precinct in a district
			boundaryJson = "[[-74.643395,39.530695],[-74.641857,39.53201],[-74.640344,39.533325999999995],[-74.639816,39.532938],[-74.63933,39.532616],[-74.63929,39.532593],[-74.63875,39.532233],[-74.63820199999999,39.531867999999996],[-74.63793299999999,39.531667],[-74.63768499999999,39.531495],[-74.637164,39.53114],[-74.636623,39.53077],[-74.63606399999999,39.530373],[-74.635499,39.529976],[-74.634941,39.529616],[-74.634377,39.529212],[-74.63428499999999,39.529146],[-74.63390799999999,39.52887],[-74.633723,39.528745],[-74.633335,39.528481],[-74.63286,39.528143],[-74.63163399999999,39.527277999999995],[-74.63050199999999,39.52648],[-74.628908,39.525361],[-74.630421,39.524055],[-74.631967,39.52274],[-74.632908,39.523378],[-74.63324899999999,39.523615],[-74.63376699999999,39.523976],[-74.634027,39.52415],[-74.634283,39.524333],[-74.634874,39.524735],[-74.63542199999999,39.525112],[-74.635941,39.525484999999996],[-74.636473,39.52585],[-74.63680099999999,39.526078999999996],[-74.63698699999999,39.52621],[-74.637391,39.526495],[-74.638036,39.526952],[-74.638556,39.527325],[-74.639135,39.527716],[-74.639707,39.528099],[-74.640236,39.528486],[-74.640766,39.528856],[-74.641273,39.529222999999995],[-74.641536,39.529393],[-74.64182199999999,39.529588],[-74.642331,39.529942999999996],[-74.642872,39.530328999999995],[-74.643395,39.530695]]";
			String centrePoint = "[-74.63820199999999,39.531867999999996]";
			Precinct p = new Precinct(d.getDistrictId(),centrePoint,boundaryJson,teamName);
			result = hb.persistToDB(p);
			
			hb.persistToDB(new PartyRepresentative("John","Brooklyn",teamName));
			
			java.sql.Date jsqlD = java.sql.Date.valueOf( "2010-01-31" );
			ElectionData ed = new ElectionData(1,PartyName.Democratic,ElectionType.Congress, 1001, 1, 10, jsqlD,teamName);
			hb.persistToDB(ed);
			
			hb.addRemark(ed, "Old Election data");
			
		} catch (Throwable e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}finally {
			if(result)
				System.out.println("success");
		}				
	}
}
