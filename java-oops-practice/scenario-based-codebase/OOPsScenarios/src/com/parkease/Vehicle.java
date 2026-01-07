package com.parkease;

import java.text.DecimalFormat;

/*
 * ParkEase – Smart Parking Management System
 * 
 * A city wants a smart parking solution that can assign parking slots, calculate charges,
 * and track availability in real time.
 */
public abstract class Vehicle {

	protected String vehicleNumber;
	protected double baseRate;

	public Vehicle(String vehicleNumber, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public abstract String getType();

	protected abstract double calculateCharges(int parkingHours);




}
