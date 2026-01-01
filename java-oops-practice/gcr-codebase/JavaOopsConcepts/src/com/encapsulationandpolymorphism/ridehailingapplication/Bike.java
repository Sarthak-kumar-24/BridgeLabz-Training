package com.encapsulationandpolymorphism.ridehailingapplication;

class Bike extends Vehicle implements GPS {

    private String location = "Unknown";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8; // 20% cheaper
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

