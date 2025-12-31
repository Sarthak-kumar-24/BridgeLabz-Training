package com.inheritance.hybridinheritance.vehiclemanagementsystem;

/*Vehicle Management System
 * 
 * Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. 
 * Additionally, create a Refuelable interface implemented by PetrolVehicle
 * 
 * 
 * Define a superclass Vehicle with attributes like maxSpeed and model.
 * Create an interface Refuelable with a method refuel().
 * Define subclasses ElectricVehicle and PetrolVehicle. 
 * PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.

 */
public class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled ");
    }
}

