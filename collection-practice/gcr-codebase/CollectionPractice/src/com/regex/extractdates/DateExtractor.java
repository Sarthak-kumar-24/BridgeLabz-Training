package com.regex.extractdates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * DateExtractor
 * -------------
 * Extracts all dates from a given text
 * in dd/mm/yyyy format.
 */
public class DateExtractor {

	// Method to extract dates
	public static void extractDates(String text) {

		// Regex for dd/mm/yyyy format
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

		// Compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		System.out.println("\n Dates Found:");

		boolean found = false;

		// Find all matching dates
		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		// If no dates found
		if (!found) {
			System.out.println("No dates found.");
		}
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input text
		System.out.println("Enter text:");
		String text = sc.nextLine();

		// Extract dates
		extractDates(text);

		sc.close();
	}
}
