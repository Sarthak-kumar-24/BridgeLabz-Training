package com.birdsanctuary;

/* ======================================================
 * 
 * Acts as the parent class for all bird types
 * Holds common properties like id, name, species
 * Defines common behavior like eat()
 * Enforces polymorphism via abstract showInfo()
 * 
 * ======================================================
 */
public abstract class Bird {
	
	   protected int id;
	    protected String name;
	    
	    protected String species;

	    public Bird(int id, String name, String species) {
	        this.id = id;
	        this.name = name;
	        this.species = species;
	    }

	    public int getId() {
	        return id;
	    }

	    public void eat() {
	        System.out.println(name + " is eating.");
	    }

	    public abstract void showInfo();

}
