package com.birdsanctuary;

/* =======================================================
 * Class: Sparrow
 * 
 * Represents a Sparrow bird
 * Can fly but cannot swim
 * Implements Flyable interface
 * =======================================================
 */
public class Sparrow extends Bird implements Flyable{

    public Sparrow(int id, String name) {
        super(id, name, "Sparrow");
    }

    public void fly() {
        System.out.println(name + " is flying short distances.");
    }

    public void showInfo() {
        System.out.println(id + " | " + name + " | Sparrow | Flyable");
    }
}
