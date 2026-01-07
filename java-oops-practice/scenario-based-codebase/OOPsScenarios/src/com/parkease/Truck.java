package com.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        return hours <= 1
                ? baseRate * hours
                : (baseRate * hours) + 200;
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
