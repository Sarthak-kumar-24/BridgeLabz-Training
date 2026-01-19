package com.addressbooksystem;

/**
 * Address class represents the address of a contact.
 * This class is used as a part of Contact class
 * to demonstrate COMPOSITION.
 *
 * Fields:
 * - city
 * - state
 * - zip
 */
public class Address {
	
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    // Getters
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    // toString
    @Override
    public String toString() {
        return city + ", " + state + " - " + zip;
    }

}
