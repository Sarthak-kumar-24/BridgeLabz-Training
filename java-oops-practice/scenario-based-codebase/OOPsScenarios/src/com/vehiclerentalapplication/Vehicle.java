package com.vehiclerentalapplication;

import java.util.ArrayList;

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
public abstract class Vehicle implements Rentable {

    protected String vehicleNumber;
    protected double baseRate;   

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    
    public abstract void displayInfo();
    
    public static void main(String[] args) {

        
        Customer c1 = new Customer("Sarthak");

        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike("BIKE-101"));
        vehicles.add(new Car("CAR-202"));
        vehicles.add(new Truck("TRUCK-303"));

        int days = 3;

        c1.displayInfo();

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Rent for " + days + " days: Rs " + v.calculateRent(days));
            System.out.println("---------------------------------------------");
        }
    }
}

