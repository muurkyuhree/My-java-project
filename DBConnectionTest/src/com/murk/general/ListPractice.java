package com.murk.general;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		//Very similar to an array
		//When you define the array , either you specify all the values
		/**
		 * You use an ArrayLlist when you are not sure about the size of your data
		 */
		List<String> stringSam = new ArrayList<String>(); 
		
		//Adding values to stringSam
		stringSam.add("Lewatle");
		stringSam.add("Sibongile");
		stringSam.add("waka");
		stringSam.add("papa");
		
		
		stringSam.remove(1);
		//Looping through stringSam to get the size of the String
//		for(int i = 0; i < stringSam.size(); i++){
//			System.out.println(stringSam.get(i));
//		}
		
		//Same as the loop above
		for(String string : stringSam){
			System.out.println(string + "");
		}
		
		
	}

}
