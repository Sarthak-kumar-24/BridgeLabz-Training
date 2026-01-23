package com.regex.validateusername;

import java.util.Scanner;

/* ---------------------------------------------
 * 
* Validates a username based on given rules:
* 1. Starts with a letter
* 2. Contains only letters, digits, underscore
* 3. Length between 5 and 15 characters
* ----------------------------------------------
*/
public class ValidateUserName {

	// Method to validate username
	public static boolean isValidUsername(String username) {

		// Regex pattern for validation
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

		// matches() returns true if username follows pattern
		return username.matches(regex);
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking username input
		System.out.print("Enter username: ");
		String username = sc.nextLine();

		// Validation check
		if (isValidUsername(username)) {
			System.out.println(" Username is VALID");
		} else {
			System.out.println(" Username is INVALID");
		}

		sc.close();
	}

}
