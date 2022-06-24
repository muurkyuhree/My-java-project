package com.murk.general;

import java.util.*;

//Taking a class as a parameter
public class StackClass {
	
	

	public static void main(String[] args) {
		
		//The results are based on what you put in
		//Last In, Fist out. when you use a add();
		//push() , adding another type onto the stack
		//pop() , Taking out the top of the stack and retrieving it's value.
		//peek() , Get the value from the top of the stack without removing the sata.
		//size() = Show the size of the stack.
		//capacity() = How many stack by default it holds
		
		/**
		 * 
		 */
		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(12);
//		stack.push(13);
		for(int i = 0; i < 50; i++) stack.push(i);
		
		System.out.println("The top of the stack has: " + stack.pop() + "\n"+
							"Stack size is: " + stack.size());
		
	}

}
