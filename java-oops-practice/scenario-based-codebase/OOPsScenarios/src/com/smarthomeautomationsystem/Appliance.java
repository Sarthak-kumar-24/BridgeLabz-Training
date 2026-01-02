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
public abstract class Appliance implements Controllable {

    private boolean powerOn;        
    protected int powerUsage;       

    public Appliance() {
        this.powerOn = false;
        this.powerUsage = 0;
    }

    public Appliance(int powerUsage) {
        this.powerOn = false;
        this.powerUsage = powerUsage;
    }

    protected void setPowerOn(boolean status) {
        powerOn = status;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public abstract void displayStatus();
    
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController controller = new UserController();

        
        
        controller.controlDevice(light, true);
        controller.controlDevice(fan, true);
        controller.controlDevice(ac, true);

        System.out.println("\n---------DEVICE STATUS--------");
        light.displayStatus();
        fan.displayStatus();
        ac.displayStatus();

        System.out.println("\nPOWER COMPARISON");
        controller.compareUsage(light,fan, ac);

        controller.controlDevice(ac, false);
    }
}

