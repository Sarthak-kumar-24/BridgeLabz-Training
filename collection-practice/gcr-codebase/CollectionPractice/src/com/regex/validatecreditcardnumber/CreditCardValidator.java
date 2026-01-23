package com.regex.validatecreditcardnumber;

import java.util.Scanner;

/*
 * CreditCardValidator
 * -------------------
 * Validates credit card numbers for:
 * - Visa (starts with 4, 16 digits)
 * - MasterCard (starts with 5, 16 digits)
 */
public class CreditCardValidator {

	// Method to validate credit card
	public static String validateCard(String cardNumber) {

		// Visa regex
		String visaRegex = "^4\\d{15}$";

		// MasterCard regex
		String masterRegex = "^5\\d{15}$";

		if (cardNumber.matches(visaRegex)) {
			return " Valid Visa card";
		} else if (cardNumber.matches(masterRegex)) {
			return " Valid MasterCard";
		} else {
			return " Invalid card number";
		}
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking card number input
		System.out.print("Enter credit card number: ");
		String cardNumber = sc.nextLine();

		// Validate card
		String result = validateCard(cardNumber);

		// Display result
		System.out.println(result);

		sc.close();
	}
}
