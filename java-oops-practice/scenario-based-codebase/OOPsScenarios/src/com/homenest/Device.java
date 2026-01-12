package com.homenest;


import java.util.ArrayList;
import java.util.List;

/* HomeNest – Smart Home Device Manager
 * 
 * Device base class: deviceId, status, energyUsage.
 * Subclasses: Light, Camera, Thermostat, Lock.
 *  Interface IControllable: turnOn(), turnOff(), reset().
 * Use constructors to register devices with user.
 *  Encapsulation: device status cannot be modified externally.
 *  Polymorphism: reset() behavior varies by device.
 *  
 *  
 */
public abstract class Device implements IControllable{
	
    protected int deviceId;
    private boolean status;
    protected double energyUsage;
    protected String registeredUser;

    // Secure firmware log
    protected final List<String> firmwareLogs = new ArrayList<>();

    public Device(int deviceId, String user) {
        this.deviceId = deviceId;
        this.registeredUser = user;
        this.status = false;
        this.energyUsage = 0;
        firmwareLogs.add("Device registered for user: " + user);
    }

    // Encapsulation
    public boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    public void logUpdate(String msg) {
        firmwareLogs.add(msg);
    }

    public void showInfo() {
        System.out.println("ID: " + deviceId +
                " | User: " + registeredUser +
                " | Status: " + (status ? "ON" : "OFF") +
                " | Energy: " + energyUsage + " units");
    }

}
