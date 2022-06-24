package com.murk.general;

import java.util.HashMap;
import java.util.Map;

public class HashMaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//K = stands for a Key, key must be unique
		//V = Value the Key is bound to
//		Map<K, V> dataMap = new HapMap<k,V>();
		//You can, put() method to put thing in the map
		//You can, get() method to get thing in the map
		Map<Integer, String> dataMap = new HashMap<Integer, String>();
		
		dataMap.put(0, "Lati");
		dataMap.put(1, "Sea");
		dataMap.put(2, "Fentse");
		dataMap.put(3, "Fifi");
		dataMap.put(4, "Lesedi");
		
		
//		System.out.println(dataMap.get(2));
		System.out.println(dataMap.get((int) (Math.random() * 4)));

	}

}
