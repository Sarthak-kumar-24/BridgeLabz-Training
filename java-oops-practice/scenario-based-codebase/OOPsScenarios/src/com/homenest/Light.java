package com.homenest;

public class Light extends Device {
	
    public Light(int id, String user) {
        super(id, user);
    }

    public void turnOn() {
        setStatus(true);
        energyUsage += 5;
    }

    public void turnOff() {
        setStatus(false);
    }

    public void reset() {
        energyUsage = 0;
        logUpdate("Light reset");
    }

}
