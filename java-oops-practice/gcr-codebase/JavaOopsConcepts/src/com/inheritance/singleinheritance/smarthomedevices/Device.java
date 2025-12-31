package com.inheritance.singleinheritance.smarthomedevices;

/*Smart Home Devices
 * 
 * Description: Create a hierarchy for a smart home system where 
 * Device is the superclass and Thermostat is a subclass.
 * 
 * Define a superclass Device with attributes like deviceId and status.
 * Create a subclass Thermostat with additional attributes like temperatureSetting.
 * Implement a method displayStatus() to show each device's current settings.
 */
public class Device {

    private String deviceId;
    private boolean status; 

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Getters
    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    // Method to be overridden
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
    public static void main(String[] args) {

        Device device = new Thermostat("TH-101", true, 24.5);

        device.displayStatus();
    }
}

