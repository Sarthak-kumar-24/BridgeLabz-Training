package com.functionalinterfaces.multivehiclerentalsystem;

/*
 * Bike class
 * ----------
 * Represents a rental bike.
 */
public class Bike implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println(" Bike has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println(" Bike has been returned");
    }
}
