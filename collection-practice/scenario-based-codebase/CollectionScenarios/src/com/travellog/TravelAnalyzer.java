package com.travellog;

import java.util.*;
import java.util.regex.*;

/**
 * TravelAnalyzer ---------------- Performs analysis on Trip data using Java
 * Collections, Regex, and sorting.
 */
public class TravelAnalyzer {

	// Regex to extract city names from notes (simple assumption)
	private static final Pattern CITY_PATTERN = Pattern.compile("\\b[A-Z][a-z]+\\b");

	/** Prints all cities mentioned in trip notes */
	public static void printCitiesUsingRegex(List<Trip> trips) {

		System.out.println("\nCities found using regex:");

		for (Trip trip : trips) {
			Matcher matcher = CITY_PATTERN.matcher(trip.getNotes());
			while (matcher.find()) {
				System.out.println(matcher.group());
			}
		}
	}

	/** Prints trips longer than 5 days */
	public static void printLongTrips(List<Trip> trips) {

		System.out.println("\nTrips longer than 5 days:");

		for (Trip trip : trips) {
			if (trip.getDurationDays() > 5) {
				System.out.println(trip);
			}
		}
	}

	/** Prints unique countries visited */
	public static void printUniqueCountries(List<Trip> trips) {

		Set<String> countries = new HashSet<>();

		for (Trip trip : trips) {
			countries.add(trip.getCountry());
		}

		System.out.println("\nUnique countries visited:");
		for (String country : countries) {
			System.out.println(country);
		}
	}

	/** Prints top 3 most visited cities */
	public static void printTopCities(List<Trip> trips) {

		Map<String, Integer> cityCount = new HashMap<>();

		for (Trip trip : trips) {
			cityCount.put(trip.getCity(), cityCount.getOrDefault(trip.getCity(), 0) + 1);
		}

		List<Map.Entry<String, Integer>> list = new ArrayList<>(cityCount.entrySet());

		list.sort((a, b) -> b.getValue() - a.getValue());

		System.out.println("\nTop 3 most visited cities:");
		for (int i = 0; i < Math.min(3, list.size()); i++) {
			System.out.println(list.get(i).getKey() + " → " + list.get(i).getValue() + " visits");
		}
	}
}
