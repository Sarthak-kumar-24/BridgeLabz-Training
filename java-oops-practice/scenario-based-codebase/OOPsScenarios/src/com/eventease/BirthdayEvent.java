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
import java.time.LocalDate;

public class BirthdayEvent extends Event {

	public BirthdayEvent(String eventName, String location, LocalDate date, int attendees, User organizer,
			double venueCost, double serviceCost, double discount) {

		super(eventName, location, date, attendees, organizer, venueCost, serviceCost, discount);
	}

	@Override
	public void schedule() {
		System.out.println(" Birthday Event scheduled with fun decorations & cake!");
	}
}
