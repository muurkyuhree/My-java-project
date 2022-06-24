package com.murk.general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//Creating a LinkedList
		LinkedList<String> days = new LinkedList();
		
		//Adding new elements to the end of the LinkedList using add() method.
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		days.add("Thur");
		days.add("Fri");
		days.add("Sat");
		days.add("Sun");
		
		System.out.println("Initial LinkedList: " + days);
		
		//Adding an element at the specific position in the LinkedList
		days.add(4, "Pre-Fri");
		System.out.println("\nAfter add(4,\"Pre-Fri\"): " + days);
		
		//Adding an element at the beginning of the LinkedList
		days.addFirst("Sondag");
		System.out.println("\nAfter addFirst(\"Sondag\"): " + days);
		
		//Adding an element at the end of the LinkedList
		days.addLast("Monday");
		System.out.println("\nAfter addLast(\"Monday\"): " + days);
		
		//Adding all the elements from an existing collection to the end of the LinkedList
		List<String> months = new ArrayList<String>();
		months.add("Umsombuluko");
		months.add("Isonto");
		
		days.addAll(months);
		System.out.println("\nAfter AddAll(months): " + days);
		
		

	}

}
 