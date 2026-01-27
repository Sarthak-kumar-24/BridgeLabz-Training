package com.junit.testingtemperatureconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * TemperatureConverterTest
 * ------------------------
 * JUnit tests for TemperatureConverter.
 */
public class TemperatureConverterTest {

	private final TemperatureConverter converter = new TemperatureConverter();

	/* ===== CELSIUS TO FAHRENHEIT TESTS ===== */
	@Test
	void testCelsiusToFahrenheit() {
		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
		assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
		assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001);
	}

	/* ===== FAHRENHEIT TO CELSIUS TESTS ===== */
	@Test
	void testFahrenheitToCelsius() {
		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
		assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
		assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001);
	}
}
