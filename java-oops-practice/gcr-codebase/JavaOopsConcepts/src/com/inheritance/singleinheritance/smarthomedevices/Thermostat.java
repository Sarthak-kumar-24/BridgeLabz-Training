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
public class Thermostat extends Device {

    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

