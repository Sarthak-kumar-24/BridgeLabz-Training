package com.traincompanion;

public class Compartment {
	
    int number;
    String services;
    Compartment prev, next;

    Compartment(int number, String services) {
        this.number = number;
        this.services = services;
        this.prev = null;
        this.next = null;
    }

}
