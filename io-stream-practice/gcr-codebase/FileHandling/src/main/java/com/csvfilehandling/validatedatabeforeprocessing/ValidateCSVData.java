package com.csvfilehandling.validatedatabeforeprocessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

//------------------------------------------------------------

//Program Name : ValidateCSVData
//Description  : This program reads a CSV file and validates
//           Email and Phone Number columns using regex.
//           Invalid rows are printed with error messages.
//CSV File     : users.csv
//Author       : Your Name
//------------------------------------------------------------

public class ValidateCSVData {

	// Regex pattern for valid email
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	// Regex pattern for exactly 10 digit phone number
	private static final String PHONE_REGEX = "^\\d{10}$";

	// Main method - program execution starts here
	public static void main(String[] args) {

		String filePath = "users.csv";
		boolean isHeader = true;

		// Compile regex patterns
		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			System.out.println("Invalid CSV Records");
			System.out.println("-------------------");

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV row into fields
				String[] data = line.split(",");

				String email = data[2];
				String phone = data[3];

				boolean isEmailValid = emailPattern.matcher(email).matches();
				boolean isPhoneValid = phonePattern.matcher(phone).matches();

				// Print invalid rows with specific error messages
				if (!isEmailValid || !isPhoneValid) {

					System.out.println("Invalid Row: " + line);

					if (!isEmailValid) {
						System.out.println(" -> Invalid Email Format");
					}

					if (!isPhoneValid) {
						System.out.println(" -> Invalid Phone Number (must be 10 digits)");
					}

					System.out.println();
				}
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
