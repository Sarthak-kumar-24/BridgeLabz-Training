package com.inheritance.hierarchicalinheritance.vehicleandtransportsystem;

/*Vehicle and Transport System
 * 
 * Description: Design a vehicle hierarchy where Vehicle is the superclass, 
 * and Car, Truck, and Motorcycle are subclasses with unique attributes.
 * 
 * Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
 * Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
 * Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.

 * 
 */
public class Truck extends Vehicle {

    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

