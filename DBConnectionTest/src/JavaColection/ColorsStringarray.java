package JavaColection;

import java.util.ArrayList;

public class ColorsStringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating colors String
		ArrayList<String> myColors = new ArrayList<String>();
		myColors.add("Red");
		myColors.add("Black");
		myColors.add("White");
		myColors.add("Brown");
		myColors.add("Yellow");
		myColors.add("Green");
		
		//Loopping through the String and printout collection
//		for( String string : myColors){
//			System.out.println("Color : " + string);
//		}
//		
		myColors.remove(2);
		System.out.println("Colors String after remove: " + myColors);
		

	}

}
