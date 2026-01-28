package com.functionalinterfaces.smartdevicecontrolinterface;

/*
 * Light class
 * -----------
 * Represents a smart light device.
 */
public class Light implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println(" Light is turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println(" Light is turned OFF");
	}
}
