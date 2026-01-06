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
public interface ISchedulable {

    void schedule();
    void reschedule(LocalDate newDate);
    void cancel();
}
