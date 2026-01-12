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
public class Lock extends Device {
    public Lock(int id, String user) {
        super(id, user);
    }

    public void turnOn() {
        setStatus(true);
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        logUpdate("Lock security re-keyed");
    }
}
