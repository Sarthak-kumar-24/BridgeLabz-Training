package com.functionalinterfaces.multivehiclerentalsystem;

/*
 * Car class
 * ---------
 * Represents a rental car.
 */
public class Car implements RentalVehicle {

	@Override
	public void rent() {
		System.out.println(" Car has been rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println(" Car has been returned");
	}
}
