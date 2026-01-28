package com.functionalinterfaces.passwordstrengthvalidator;

import java.util.Scanner;

/*
 * PasswordValidatorApp
 * --------------------
 * Tests password strength using
 * SecurityUtils interface.
 */
public class PasswordValidatorApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		// Call static method using interface name
		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println(" Strong password");
		} else {
			System.out.println(" Weak password");
		}

		scanner.close();
	}
}
