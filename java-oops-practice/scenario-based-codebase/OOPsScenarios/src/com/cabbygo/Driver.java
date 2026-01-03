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
class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getDriverInfo() {
        return name + " | Rating: " + rating;
    }
}

