package com.petpal;

/*
 * PetPal – Virtual Pet Care App
 * 
 *  You’re creating PetPal, an app that allows users to adopt and care for virtual pets like dogs, cats, and birds.
 * 
 * 
 * Pet base class: name, type, age.
 * Derived classes: Dog, Cat, Bird (use inheritance).
 * IInteractable interface with methods like feed(), play(), sleep().
 * Encapsulation of hunger and mood levels.
 * 
 */
public class Dog extends Pet{
	
	public Dog( String name, int age) {
		super(name, "Dog", age);
	}
    @Override
    public void feed() {
        decreaseHunger(20);
        System.out.println(name + " is eating happily ");
    }

    @Override
    public void play() {
        decreaseEnergy(15);
        increaseHunger(10);
        System.out.println(name + " is playing fetch ");
    }

    @Override
    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is sleeping peacefully ");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

}
