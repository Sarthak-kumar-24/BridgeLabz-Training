package com.junit.testinguserregistration;

/*
 * UserRegistration
 * ----------------
 * Handles user registration validation.
 */
public class UserRegistration {

    // Registers a user after validating inputs
    public void registerUser(String username, String email, String password) {

        // Username validation
        if (username == null || username.trim().length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }

        // Email validation
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Password validation
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        if (!hasUppercase || !hasDigit) {
            throw new IllegalArgumentException("Invalid password");
        }

        // If all validations pass
        System.out.println(" User registered successfully");
    }
}

