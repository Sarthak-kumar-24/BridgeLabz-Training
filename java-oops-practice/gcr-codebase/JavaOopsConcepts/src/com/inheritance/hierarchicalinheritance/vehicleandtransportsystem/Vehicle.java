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
public class Vehicle {

    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Getters
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to be overridden
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
    
    public static void main(String[] args) {

    	Vehicle car = new Car(180, "Petrol", 5);
    	Vehicle truck = new Truck(120, "Diesel", 12.5);
    	Vehicle bike = new Motorcycle(140, "Petrol", true);

    	car.displayInfo();
    	System.out.println("------------------------");

    	truck.displayInfo();
    	System.out.println("------------------------");

    	bike.displayInfo();
    }
}

