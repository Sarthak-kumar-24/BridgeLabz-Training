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
public class Vehicle {

    private int maxSpeed;
    private String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
    
    public static void main(String[] args) {

    	ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
    	PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

    	ev.displayInfo();
    	ev.charge();

    	System.out.println();

    	pv.displayInfo();
    	pv.refuel();
    }
}

