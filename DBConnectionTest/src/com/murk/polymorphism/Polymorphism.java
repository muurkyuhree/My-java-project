package com.murk.polymorphism;


/**
 * Ability of a VARIABLE,FUNCTION or OBJECT to take on many forms
 * @author Mercury
 *
 */
//When a subClass is derived from the parent class
public class Polymorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Duck(2);
		((Duck)myAnimal).getAge();
		((Duck)myAnimal).makeSound();
		((Duck)myAnimal).flapWings();
		
		myAnimal = new Dog(2);
		((Dog)myAnimal).getAge();
		((Dog)myAnimal).makeSound();
		
		myAnimal = new Cat(2);
		((Cat)myAnimal).getAge();
		((Cat)myAnimal).makeSound();
	}

}
