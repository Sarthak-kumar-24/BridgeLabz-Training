package com.functionalinterfaces.multivehiclerentalsystem;

/*
 * RentalVehicle Interface
 * -----------------------
 * Defines common rental operations
 * for all types of vehicles.
 */
public interface RentalVehicle {

	/**
	 * Rent the vehicle
	 */
	void rent();

	/**
	 * Return the rented vehicle
	 */
	void returnVehicle();
}
