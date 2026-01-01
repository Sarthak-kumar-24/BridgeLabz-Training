package com.encapsulationandpolymorphism.vehiclerentalsystem;
import java.util.ArrayList;
import java.util.List;

/*
 * Vehicle Rental System
 * 
 * Description: Design a system to manage vehicle rentals:
 * 
 * 
 * Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
 * Add an abstract method calculateRentalCost(int days).
 * Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
 * Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
 * Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
 * Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
 */
abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // sensitive info (encapsulation)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // No getter for policy number → protected
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // abstract behavior
    public abstract double calculateRentalCost(int days);
    
    public static void printRentalDetails(List<Vehicle> vehicles, int days) {

        for (Vehicle v : vehicles) {

            double rent = v.calculateRentalCost(days);

            double insurance = 0;
            if (v instanceof Insurable i) {
                insurance = i.calculateInsurance();
            }

            System.out.println("Vehicle: " + v.getType());
            System.out.println("Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: Rs" + rent);
            System.out.println("Insurance Cost: rs" + insurance);
            System.out.println("Total Cost: Rs" + (rent + insurance));
            System.out.println("----------------------------");
        }
    }
    
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-INS-11"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-22"));
        vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-INS-33"));

        printRentalDetails(vehicles, 3);
    }
}

