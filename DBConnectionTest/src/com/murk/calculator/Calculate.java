package com.murk.calculator;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition add = new Addition();
		System.out.println("Addition:" + add.Add(18,12));
		
		Minus minus = new Minus();
		System.out.println("\nMinus: " + minus.Minuss(85, 49));
		
		Multiple multiply = new Multiple();
		System.out.println("\nMultiply: " + multiply.Multiply(75, 7));
		
		Devide devide = new Devide();
		System.out.println("\nDevide: " + devide.Devive(100, 15));

	}

}
