package com.junit.testingdateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

/*
 * DateFormatterTest
 * -----------------
 * JUnit tests for DateFormatter class.
 */
public class DateFormatterTest {

	private final DateFormatter formatter = new DateFormatter();

	/* ===== VALID DATE TEST ===== */
	@Test
	void testValidDate() {
		String result = formatter.formatDate("2024-08-15");
		assertEquals("15-08-2024", result);
	}

	/* ===== ANOTHER VALID DATE ===== */
	@Test
	void testAnotherValidDate() {
		assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
	}

	/* ===== INVALID DATE FORMAT ===== */
	@Test
	void testInvalidFormat() {
		assertThrows(DateTimeParseException.class, () -> {
			formatter.formatDate("15-08-2024");
		});
	}

	/* ===== INVALID DATE VALUE ===== */
	@Test
	void testInvalidDateValue() {
		assertThrows(DateTimeParseException.class, () -> {
			formatter.formatDate("2024-02-30");
		});
	}

	/* ===== NULL INPUT ===== */
	@Test
	void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatDate(null);
		});
	}
}
