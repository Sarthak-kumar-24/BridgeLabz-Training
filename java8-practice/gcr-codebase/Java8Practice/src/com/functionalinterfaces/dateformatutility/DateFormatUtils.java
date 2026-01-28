package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * DateFormatUtils Interface
 * ------------------------
 * Provides static utility methods
 * for formatting dates in invoices.
 */
public interface DateFormatUtils {

	/**
	 * Formats a LocalDate into a specified pattern.
	 *
	 */
	static String formatDate(LocalDate date, String pattern) {

		if (date == null || pattern == null || pattern.isEmpty()) {
			throw new IllegalArgumentException("Date and pattern must not be null or empty");
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return date.format(formatter);
	}
}
