package com.functionalinterfaces.smartdevicecontrolinterface;

/*
 * SmartHomeController 
 * ------------------- 
 * Demonstrates interface-based
 * programming using polymorphism.
 */
public class SmartHomeController {

	public static void main(String[] args) {

		// Creating objects using interface reference
		SmartDevice light = new Light();
		SmartDevice ac = new AC();
		SmartDevice tv = new TV();

		// Operating devices
		light.turnOn();
		light.turnOff();

		ac.turnOn();
		ac.turnOff();

		tv.turnOn();
		tv.turnOff();
	}
}