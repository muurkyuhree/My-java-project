package com.murk.service;

import com.murk.utility.*;
import javax.jws.*;

import sun.text.normalizer.Utility;

/**
 * Session Bean implementation class CountryImpl
 */
@WebService
public class CountryImpl {

    /**
     * Default constructor. 
     */
	private Utility states;
    public CountryImpl() {
    	
    	states = new Utility();
    	states.loadData();
    	
    	@WebMethod
    	String getCapitals(String stateName){
    		return states.getStates(stateName).getCapital();
    	}
    	
    	@WebMethod
    	String getLanguagess(String stateName){
    		return states.getStates(stateName).getLanguagess();
    	}

    	@WebMethod
    	String getAirports(String stateName){
    		return states.getStates(stateName).getAirports();
    	}
    	
    	@WebMethod
    	String getDistricts(String stateName){
    		return states.getStates(stateName).getDistricts();
    	}
    	
    	@WebMethod
    	String getPlacesToVisit(String stateName){
    		return states.getStates(stateName).getPlacesToVisit();
    	}
    	
    	@WebMethod
    	String getInterestingFacts(String stateName){
    		return states.getStates(stateName).getInterestingFacts();
    	}
    }

}
