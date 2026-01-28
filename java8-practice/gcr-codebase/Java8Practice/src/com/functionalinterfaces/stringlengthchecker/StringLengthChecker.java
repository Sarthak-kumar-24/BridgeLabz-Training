package com.functionalinterfaces.stringlengthchecker;

import java.util.Scanner;
import java.util.function.Function;

/*
 * StringLengthChecker
 * -------------------
 * Uses Function<String, Integer> to
 * calculate the length of a message
 * and verify it against a limit.
 */
public class StringLengthChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Maximum allowed character limit
		final int CHARACTER_LIMIT = 50;

		// Function to calculate string length
		Function<String, Integer> lengthCalculator = message -> message.length();

		// Take message input from user
		System.out.print("Enter your message: ");
		String message = scanner.nextLine();

		// Apply function to get message length
		int messageLength = lengthCalculator.apply(message);

		// Check length against limit
		if (messageLength > CHARACTER_LIMIT) {
			System.out.println(" Message exceeds character limit!");
		} else {
			System.out.println(" Message is within the character limit.");
		}

		// Display length information
		System.out.println("Message Length: " + messageLength);

		scanner.close();
	}
}
