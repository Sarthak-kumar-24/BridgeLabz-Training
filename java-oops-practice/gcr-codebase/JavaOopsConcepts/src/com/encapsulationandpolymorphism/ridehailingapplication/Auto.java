package com.encapsulationandpolymorphism.ridehailingapplication;

class Auto extends Vehicle implements GPS {

    private String location = "Unknown";

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 30; // base charge
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

