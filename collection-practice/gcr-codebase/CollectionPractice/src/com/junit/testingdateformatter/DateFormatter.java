package com.junit.testingdateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * DateFormatter
 * -------------
 * Converts date from yyyy-MM-dd to dd-MM-yyyy format.
 */
public class DateFormatter {

	// Converts yyyy-MM-dd to dd-MM-yyyy
	public String formatDate(String inputDate) {

		if (inputDate == null) {
			throw new IllegalArgumentException("Date cannot be null");
		}

		
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		// Parse input date (throws DateTimeParseException if invalid)
		LocalDate date = LocalDate.parse(inputDate, inputFormatter);

		// Format to required output
		return date.format(outputFormatter);
	}
}
