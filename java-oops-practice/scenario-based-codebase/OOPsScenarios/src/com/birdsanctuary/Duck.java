package com.birdsanctuary;

/* =======================================================
 * Class: Duck
 * 
 * Represents a Duck bird
 * Can both fly and swim
 * Implements Flyable and Swimmable interfaces
 * 
 * =======================================================
 */
public class Duck extends Bird implements Flyable, Swimmable{
	
	   public Duck(int id, String name) {
	        super(id, name, "Duck");
	    }

	    public void fly() {
	        System.out.println(name + " is flying.");
	    }

	    public void swim() {
	        System.out.println(name + " is swimming.");
	    }

	    public void showInfo() {
	        System.out.println(id + " | " + name + " | Duck | Flyable & Swimmable");
	    }

}
