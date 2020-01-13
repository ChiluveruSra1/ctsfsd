package assignment.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Country {
	private String name;
	
	List<State> stateList=new LinkedList<State>();
	State state=new State();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addState(String statename) { // Add the new state to this country object
		stateList.add(state.getStateName);
		
	}
	public void getStateList() {// - Sort the state collection and return the list
		List<State> l=Arrays.asList(state);
		Collections.sort(l);
		
		
	}
	
}
