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
public class UserController {

    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn)
            device.turnOn();
        else
            device.turnOff();
    }

    public void compareUsage(Appliance a1, Appliance a2, Appliance a3) {
        if (a1.getPowerUsage() > a2.getPowerUsage()&& a2.getPowerUsage() > a3.getPowerUsage())
            System.out.println(" First appliance uses more power");
        else if (a1.getPowerUsage() < a2.getPowerUsage() && a2.getPowerUsage() > a3.getPowerUsage() )
            System.out.println(" Second appliance uses more power");
        else
            System.out.println(" 3rd appliance use more power");
    }
}

