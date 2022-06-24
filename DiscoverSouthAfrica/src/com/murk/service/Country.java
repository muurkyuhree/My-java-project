package com.murk.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Country {
	
	@WebMethod
	String getCapitals(String s);
	
	@WebMethod
	String getLanguages(String s);
	
	@WebMethod
	String getAirports(String s);
	
	@WebMethod
	String getDistricts(String s);
	
	@WebMethod
	String getPlacesToVisit(String s);
	
	@WebMethod
	String getInterestingFacts(String s);

}
