package com.murk.utility;

import java.util.HashMap;
import java.util.Map;

import javax.swing.undo.StateEdit;

import com.murk.ejb.*;

public class Utility {
	
	Map<String, State> state_map;
	
	Utility() {
		state_map = new HashMap<String, State>();
	}
	
	void loadData(){
		
		State johannesburg = new State("Johannesbu", "", , ", ", "", "", "");
		State
		State
		State
		
	}
	
	State getState(String stateName){
		State state = null;
		state = state_map.get(stateName);
		return state;
	}

}
