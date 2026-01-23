package com.regex.extractcurrencyvaluesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * CurrencyValueExtractor
 * ----------------------
 * Extracts currency values from a given text.
 * Supports values like:
 * $45.99, 10.50
 */
public class CurrencyValueExtractor {

	// Method to extract currency values
	public static void extractCurrencyValues(String text) {

		// Regex for currency values
		String regex = "\\$?\\d+\\.\\d{2}";

		// Compile regex
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		System.out.println("\n Currency Values Found:");

		boolean found = false;

		// Find all matches
		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		// If no currency value found
		if (!found) {
			System.out.println("No currency values found.");
		}
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking input text
		System.out.println("Enter text:");
		String text = sc.nextLine();

		// Extract currency values
		extractCurrencyValues(text);

		sc.close();
	}
}
