package com.eventease;

import java.time.LocalDate;

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
abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected LocalDate date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without packages
    public Event(String eventName, String location, LocalDate date, int attendees, User organizer, double venueCost) {
        this(eventName, location, date, attendees, organizer, venueCost, 0, 0);
    }

    // Constructor with catering / decoration packages
    public Event(String eventName, String location, LocalDate date, int attendees, User organizer, 
    		      double venueCost, double serviceCost, double discount) {

        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Encapsulated pricing logic
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount; 
    }

    public void showSummary() {
        System.out.println("Event Name   : " + eventName);
        System.out.println("Location     : " + location);
        System.out.println("Date         : " + date);
        System.out.println("Attendees    : " + attendees);
        System.out.println("Organizer    : " + organizer.getName());
        System.out.println("Total Cost   : Rs" + calculateTotalCost());
    }

    @Override
    public void reschedule(LocalDate newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled ");
    }

    // Polymorphic behavior
    public abstract void schedule();
    
    static void header(String title) {
        System.out.println("\n====================================");
        System.out.println(" " + title.toUpperCase());
        System.out.println("====================================");
    }

    public static void main(String[] args) {

        header("EventEase Platform");

        // Organizer
        User organizer = new User("Sarthak", "sarthak@mail.com");

        // Store multiple events
        Event[] events = {
            new BirthdayEvent("DeviJii's Birthday","Bhopal",LocalDate.of(2026, 3, 10),50,organizer,30000,10000, 5000
            ),
            new ConferenceEvent("Tech Conference 2026","Bangalore",LocalDate.of(2026, 6, 5),300, organizer,200000,80000,20000
            )
        };

        // Loop through events
        for (Event event : events) {

            System.out.println("\n--- Event Details ---");
            event.showSummary();

            System.out.println("\n--- Scheduling ---");
            event.schedule();    

            System.out.println("\n--- Rescheduled ---");
            event.reschedule(event.date.plusDays(7));
        }

        header("Session Completed Successfully");
    }
}

