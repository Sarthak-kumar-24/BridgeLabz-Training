package com.junit.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * MathUtilsTest
 * -------------
 * Tests exception handling for MathUtils.
 */
public class MathUtilsTest {

	MathUtils mathUtils = new MathUtils();

	/* ===== VALID DIVISION TEST ===== */
	@Test
	void testDivideValid() {
		assertEquals(5, mathUtils.divide(10, 2));
	}

	/* ===== DIVIDE BY ZERO TEST ===== */
	@Test
	void testDivideByZero() {

		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));

		// Optional: verify exception message
		assertEquals("Division by zero is not allowed", exception.getMessage());
	}
}
