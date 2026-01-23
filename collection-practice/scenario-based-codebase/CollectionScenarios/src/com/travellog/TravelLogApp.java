package com.travellog;

import java.util.*;
import java.io.*;

/**
 * TravelLogApp ------------- Main driver class for the TravelLog system.
 * Handles user input, file operations, and invokes analysis features.
 */
public class TravelLogApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fileName = "trips.dat";

		List<Trip> trips = new ArrayList<>();

		
		trips.add(new Trip("Paris", "France", 7, "Visited Paris and enjoyed Eiffel Tower"));
		trips.add(new Trip("Rome", "Italy", 4, "Rome has amazing history"));
		trips.add(new Trip("Paris", "France", 3, "Paris cafes and museums"));
		trips.add(new Trip("Berlin", "Germany", 6, "Berlin nightlife was fun"));

		try {
			// Save trips
			TravelStorage.saveTrips(trips, fileName);

			// Load trips
			List<Trip> loadedTrips = TravelStorage.loadTrips(fileName);

			// Analysis
			TravelAnalyzer.printCitiesUsingRegex(loadedTrips);
			TravelAnalyzer.printLongTrips(loadedTrips);
			TravelAnalyzer.printUniqueCountries(loadedTrips);
			TravelAnalyzer.printTopCities(loadedTrips);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
