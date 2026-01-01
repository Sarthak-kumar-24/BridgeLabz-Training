package com.encapsulationandpolymorphism.vehiclerentalsystem;

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
class Bike extends Vehicle implements Insurable {

    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: " + getInsurancePolicyNumber();
    }
}

