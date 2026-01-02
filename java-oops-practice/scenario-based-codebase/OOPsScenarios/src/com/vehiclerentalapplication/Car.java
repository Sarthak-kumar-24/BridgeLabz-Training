package com.vehiclerentalapplication;

/* Vehicle Rental Application
 * 
 * Scenario: Build a system for renting bikes, cars, and trucks to customers.
 * 
 * Class: Vehicle, Bike, Car, Truck, Customer
 * Constructors: Custom constructors for different vehicle types
 * Access Modifiers: protected for vehicle attributes to allow subclass access
 * Interface: Rentable with method calculateRent(int days)
 * Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
 * Inheritance: Car, Bike, Truck inherit from Vehicle
 * Polymorphism: Rent calculation differs by vehicle type
 */
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 800);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 200;
        return (baseRate * days) + surcharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | Number: " + vehicleNumber);
    }
}

