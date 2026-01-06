package com.eventease;

/* EventEase – Event Management Platform
 * 
 * EventEase helps users organize events like birthdays, weddings, and conferences.
 * You’re responsible for the booking and scheduling module.
 * 
 * Event class: eventName, location, date, attendees.
 * User class to represent the organizer.
 * ISchedulable interface with methods schedule(), reschedule(), cancel().
 * 
 * 
 */
public class User {
	
    private String name;
    private String email;   

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

}
