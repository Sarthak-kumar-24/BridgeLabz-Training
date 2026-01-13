package com.birdsanctuary;

/* =======================================================
 * Class: Ostrich
 * 
 * Represents an Ostrich bird
 * Cannot fly or swim
 * Inherits only basic Bird behavior
 * 
 * =======================================================
 */
public class Ostrich extends Bird{
	
    public Ostrich(int id, String name) {
        super(id, name, "Ostrich");
    }

    public void showInfo() {
        System.out.println(id + " | " + name + " | Ostrich | Neither Fly nor Swim");
    }

}
