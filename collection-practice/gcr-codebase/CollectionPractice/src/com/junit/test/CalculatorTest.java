package com.junit.testingacalculatorclass;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/*
 * CalculatorTest
 * --------------
 * JUnit test cases for Calculator class.
 */
public class CalculatorTest {

	Calculator calculator = new Calculator();

	/* ===== ADD TEST ===== */
	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}

	/* ===== SUBTRACT TEST ===== */
	@Test
	void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2));
	}

	/* ===== MULTIPLY TEST ===== */
	@Test
	void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3));
	}

	/* ===== DIVIDE TEST ===== */
	@Test
	void testDivide() {
		assertEquals(2, calculator.divide(4, 2));
	}

	/* ===== DIVIDE BY ZERO TEST ===== */
	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});
	}
}
