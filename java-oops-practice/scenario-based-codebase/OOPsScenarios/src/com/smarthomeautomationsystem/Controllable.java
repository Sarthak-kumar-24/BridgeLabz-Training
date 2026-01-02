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
public interface Controllable {

    void turnOn();
    void turnOff();
}
