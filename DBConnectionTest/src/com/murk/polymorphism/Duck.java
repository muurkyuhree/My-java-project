package com.murk.polymorphism;

public class Duck extends Animal{

	public Duck(int age){
		super();
	}
	
	public void makeSound(){
		System.out.println("Quack quack quack quaaaaaack!");
	}
	
	public void flapWings(){
		System.out.println("Flap flap flap quack");
	}
	
}
