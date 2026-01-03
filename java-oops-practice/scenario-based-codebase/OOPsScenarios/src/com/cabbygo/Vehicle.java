package com.cabbygo;

public abstract class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public String getVehicleDetails() {
        return type + " [" + vehicleNumber + "], Capacity: " + capacity;
    }

    
    public abstract double getRatePerKm();
    
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MH12AB1234"); 
        Driver driver = new Driver("Ravi", "DL9988", 4.8);

        IRideService ride = new Ride(vehicle, driver);

        ride.bookRide(10);   // 10km
        ride.endRide();
    }
}

