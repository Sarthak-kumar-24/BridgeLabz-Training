package com.birdsanctuary;

/* =======================================================
 * Class: Penguin
 * 
 * Represents a Penguin bird
 * Can swim but cannot fly
 * Implements Swimmable interface
 * 
 * =======================================================
 */
public class Penguin extends Bird implements Swimmable{

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(name + " is swimming fast.");
    }

    public void showInfo() {
        System.out.println(id + " | " + name + " | Penguin | Swimmable");
    }
}
