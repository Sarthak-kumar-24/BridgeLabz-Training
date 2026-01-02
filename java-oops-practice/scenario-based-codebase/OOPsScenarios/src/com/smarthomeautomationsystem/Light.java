package com.smarthomeautomationsystem;

/* Smart Home Automation System
 * 
 * Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
 * 
 * Class: Appliance, Light, Fan, AC, UserController
 * Constructor: Set default or user-defined power settings
 * Access Modifiers: Internal device settings as private, toggle methods as public
 * Interface: Controllable with methods turnOn(), turnOff()
 * Inheritance: Device types inherit from Appliance
 * Polymorphism: Turning on a Light vs an AC involves different behaviors
 * 
 */
public class Light extends Appliance {

    public Light() {
        super(10); // default power usage
    }

    @Override
    public void turnOn() {
        setPowerOn(true);
        System.out.println(" Light turned ON");
    }

    @Override
    public void turnOff() {
        setPowerOn(false);
        System.out.println(" Light turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Light | Power: " + isPowerOn() +
                           " | Usage: " + powerUsage + "W");
    }
}

