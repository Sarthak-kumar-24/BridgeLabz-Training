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
public class Motorcycle extends Vehicle {

    private boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

