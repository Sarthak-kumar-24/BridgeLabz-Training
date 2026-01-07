package com.parkease;

/*
 * ParkEase – Smart Parking Management System
 * 
 * A city wants a smart parking solution that can assign parking slots, calculate charges,
 * and track availability in real time.
 */
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        return hours <= 2
                ? baseRate * hours
                : (baseRate * hours) + 100;
    }

    @Override
    public String getType() {
        return "Car";
    }

}
