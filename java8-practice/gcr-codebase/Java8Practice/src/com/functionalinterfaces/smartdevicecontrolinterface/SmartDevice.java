package com.functionalinterfaces.smartdevicecontrolinterface;

/*
 * SmartDevice interface 
 * --------------------- 
 * This interface defines common
 * operations that every smart device must support.
 */
public interface SmartDevice {

	/**
	 * Turns the device ON
	 */
	void turnOn();

	/**
	 * Turns the device OFF
	 */
	void turnOff();
}
