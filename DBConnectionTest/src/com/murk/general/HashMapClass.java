package com.murk.general;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You can, put() method to put thinf in the map
		//put(value you retrieve from, data)
		Map<Integer,Integer> list = new HashMap<Integer, Integer>();
		
		list.put(21, 50);
		list.put(27, 35);
		
		System.out.println("Retrieving 1 from map, result: " + list.get(21));
		
		
		

	}

}
