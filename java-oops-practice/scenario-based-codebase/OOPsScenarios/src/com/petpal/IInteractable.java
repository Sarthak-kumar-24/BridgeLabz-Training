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
public interface IInteractable {

	void feed();
	void play();
	void sleep();
}
