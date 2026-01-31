package com.streamAPI.eventattendeewelcomemessage;

import java.util.Arrays;
import java.util.List;

/*
 * EventWelcomeApp
 * ----------------
 * Prints welcome messages for
 * all event attendees using
 * forEach() and lambda expression.
 */
public class EventWelcomeApp {

	public static void main(String[] args) {

		// List of event attendees
		List<String> attendees = Arrays.asList("Rahul", "Ananya", "Sarthak", "Priya", "Karan");

		// Print welcome message for each attendee
		attendees.forEach(name -> System.out.println(" Welcome to the event, " + name + "!"));
	}
}
