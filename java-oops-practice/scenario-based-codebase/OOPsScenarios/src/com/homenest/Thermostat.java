package com.homenest;

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
public class Thermostat extends Device {
    public Thermostat(int id, String user) {
        super(id, user);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 20;
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        energyUsage /= 2; // operator usage
        logUpdate("Thermostat optimized");
    }
}
