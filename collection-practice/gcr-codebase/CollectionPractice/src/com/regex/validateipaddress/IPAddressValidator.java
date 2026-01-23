package com.regex.validateipaddress;

import java.util.Scanner;

/*
 * IPAddressValidator
 * ------------------
 * Validates an IPv4 address.
 * Format: four numbers (0–255) separated by dots.
 */
public class IPAddressValidator {

	// Method to validate IPv4 address
	public static boolean isValidIPv4(String ip) {

		// Regex for IPv4 validation
		String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

		// matches() ensures full match
		return ip.matches(regex);
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking IP address input
		System.out.print("Enter IPv4 address: ");
		String ip = sc.nextLine();

		// Validation check
		if (isValidIPv4(ip)) {
			System.out.println(" Valid IPv4 address");
		} else {
			System.out.println(" Invalid IPv4 address");
		}

		sc.close();
	}
}
