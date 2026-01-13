package com.birdsanctuary;

/* ======================================================
 * 
 * Class: Eagle
 * 
 * Represents an Eagle bird
 * Can fly but cannot swim
 * Implements Flyable interface
 * 
 * ======================================================
 */
public class Eagle extends Bird implements Flyable{
	
    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(name + " is soaring high.");
    }

    public void showInfo() {
        System.out.println(id + " | " + name + " | Eagle | Flyable");
    }

}
