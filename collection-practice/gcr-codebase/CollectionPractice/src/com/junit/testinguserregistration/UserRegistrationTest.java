package com.junit.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * UserRegistrationTest
 * -------------------
 * JUnit tests for UserRegistration.
 */
public class UserRegistrationTest {

	private final UserRegistration registration = new UserRegistration();

	/* ===== VALID USER REGISTRATION ===== */
	@Test
	void testValidUserRegistration() {
		assertDoesNotThrow(() -> {
			registration.registerUser("sarthak", "sarthak@example.com", "Secure123");
		});
	}

	/* ===== INVALID USERNAME ===== */
	@Test
	void testInvalidUsername() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("ab", "user@example.com", "Secure123");
		});
	}

	/* ===== INVALID EMAIL ===== */
	@Test
	void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("validUser", "userexample.com", "Secure123");
		});
	}

	/* ===== PASSWORD TOO SHORT ===== */
	@Test
	void testShortPassword() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("validUser", "user@example.com", "Ab1");
		});
	}

	/* ===== PASSWORD WITHOUT UPPERCASE ===== */
	@Test
	void testPasswordWithoutUppercase() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("validUser", "user@example.com", "password1");
		});
	}

	/* ===== PASSWORD WITHOUT DIGIT ===== */
	@Test
	void testPasswordWithoutDigit() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser("validUser", "user@example.com", "Password");
		});
	}

	/* ===== NULL INPUTS ===== */
	@Test
	void testNullInputs() {
		assertThrows(IllegalArgumentException.class, () -> {
			registration.registerUser(null, null, null);
		});
	}
}
