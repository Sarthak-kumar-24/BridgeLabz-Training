package com.cabbygo;

/*
 * "CabbyGo – A Ride-Hailing App in the Making
 * 
 * Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
 * the backend logic for managing vehicles, drivers, and ride booking.
 * 
 * Vehicle (class): fields like vehicleNumber, capacity, type.
 * Driver (class): fields like name, licenseNumber, rating.
 * Constructors to initialize vehicles and drivers.
 * An IRideService interface with methods like bookRide() and endRide().
 * Use encapsulation to hide sensitive data like location, fare.
 * Implement polymorphism with different vehicle types like Mini, Sedan, SUV
 */
class Ride implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double fare;

    private static final double BASE_FARE = 50;

    public Ride(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        fare = BASE_FARE + (distance * vehicle.getRatePerKm()); // operators used
        System.out.println("Ride Booked!");
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Driver: " + driver.getDriverInfo());
        System.out.println("Estimated Fare: rs" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended. Total Fare: Rs" + fare);
    }
}

