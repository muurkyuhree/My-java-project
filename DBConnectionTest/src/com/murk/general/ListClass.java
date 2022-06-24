package com.murk.general;

import java.util.ArrayList;
import java.util.List;


public class ListClass {

	public static void main(String[] args) {
		
		//List cannot be , it goes with an ArrayList
		//List<Animal> list = new ArrayList<Animal>();
		//get() = retrieving information from any part of the list
		/**
		 * You add everything from the bottom of the list
		 * LIFO
		 */
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(25);
		list.add(20);
		
		System.out.println("List top is: " + list.get(0) +
				"\nList size is: " + list.size());

	}

}
