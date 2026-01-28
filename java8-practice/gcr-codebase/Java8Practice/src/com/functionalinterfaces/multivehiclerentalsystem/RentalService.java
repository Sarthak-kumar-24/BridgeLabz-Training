package com.functionalinterfaces.multivehiclerentalsystem;



/*
 * RentalService
 * -------------
 * Demonstrates interface-based
 * polymorphic behavior.
 */
public class RentalService {

    public static void main(String[] args) {

        // Interface references
        RentalVehicle car = new Car();
        RentalVehicle bike = new Bike();
        RentalVehicle bus = new Bus();

        // Renting vehicles
        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("---------------------");

        // Returning vehicles
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}

