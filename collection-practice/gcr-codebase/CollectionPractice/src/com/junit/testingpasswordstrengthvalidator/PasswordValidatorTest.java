package com.junit.testingpasswordstrengthvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * PasswordValidatorTest
 * ---------------------
 * JUnit tests for PasswordValidator.
 */
public class PasswordValidatorTest {

	PasswordValidator validator = new PasswordValidator();

	/* ===== VALID PASSWORD TEST ===== */
	@Test
	void testValidPassword() {
		assertTrue(validator.isValid("Secure123"));
	}

	/* ===== TOO SHORT ===== */
	@Test
	void testPasswordTooShort() {
		assertFalse(validator.isValid("Ab1"));
	}

	/* ===== NO UPPERCASE LETTER ===== */
	@Test
	void testPasswordWithoutUppercase() {
		assertFalse(validator.isValid("password1"));
	}

	/* ===== NO DIGIT ===== */
	@Test
	void testPasswordWithoutDigit() {
		assertFalse(validator.isValid("Password"));
	}

	/* ===== NULL PASSWORD ===== */
	@Test
	void testNullPassword() {
		assertFalse(validator.isValid(null));
	}
}
