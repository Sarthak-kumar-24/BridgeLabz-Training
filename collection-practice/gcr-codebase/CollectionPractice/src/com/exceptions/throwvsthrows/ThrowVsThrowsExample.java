package com.exceptions.throwvsthrows;

public class ThrowVsThrowsExample {

	// 'throws' declares that this method may pass an exception to the caller
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		// Validating inputs
		if (amount < 0 || rate < 0) {
			// 'throw' explicitly creates and throws the exception
			throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
		}

		// Simple Interest formula: (P * R * T) / 100
		return (amount * rate * years) / 100;
	}

	// Main method → handles the propagated exception
	public static void main(String[] args) {

		try {
			// Sample input values
			double amount = 10000;
			double rate = 5;
			int years = 2;

			// Calling method that may throw exception
			double interest = calculateInterest(amount, rate, years);

			// Printed only if inputs are valid
			System.out.println("Calculated Interest: " + interest);

		} catch (IllegalArgumentException e) {
			// Handling exception propagated from calculateInterest()
			System.out.println(e.getMessage());
		}
	}

}
