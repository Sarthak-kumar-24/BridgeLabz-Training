package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

/* Ride-Hailing Application
 * 
 * Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
 * Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
 * Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
 * Use an interface GPS with methods getCurrentLocation() and updateLocation().
 * Secure driver and vehicle details using encapsulation.
 * Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.

 * 
 * 
 */
abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate/Km: rs" + ratePerKm);
    }

    // Abstract behavior
    public abstract double calculateFare(double distance);
    
    public static void calculateRides(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: Rs" + v.calculateFare(distance));

            if (v instanceof GPS g) {
                System.out.println("Location: " + g.getCurrentLocation());
            }

            System.out.println("--------------------------------------");
        }
    }
    
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", "Aman", 15));
        vehicles.add(new Bike("B202", "Neha", 10));
        vehicles.add(new Auto("A303", "Ravi", 12));

        calculateRides(vehicles, 10);
    }
}
