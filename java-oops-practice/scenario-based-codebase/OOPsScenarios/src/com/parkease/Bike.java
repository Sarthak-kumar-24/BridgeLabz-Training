package com.parkease;

/*
 * ParkEase – Smart Parking Management System
 * 
 * A city wants a smart parking solution that can assign parking slots, calculate charges,
 * and track availability in real time.
 */
public class Bike extends Vehicle {
	
	   public Bike(String vehicleNumber) {
	        super(vehicleNumber, 20);
	    }

	    @Override
	    public double calculateCharges(int hours) {
	        return hours <= 3
	                ? baseRate * hours
	                : (baseRate * hours) + 50;
	    }

	    @Override
	    public String getType() {
	        return "Bike";
	    }

}
