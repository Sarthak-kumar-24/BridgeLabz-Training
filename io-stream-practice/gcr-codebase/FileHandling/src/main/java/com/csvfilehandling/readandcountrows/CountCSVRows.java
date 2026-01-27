package com.csvfilehandling.readandcountrows;

//------------------------------------------------------------
//Program Name : CountCSVRows
//Description  : This program reads a CSV file and counts the
//             number of data records, excluding the header.
//CSV File     : employees.csv
//Author       : Your Name
//------------------------------------------------------------

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CountCSVRows {

	// Main method - program execution starts here
	public static void main(String[] args) {

		// Path of the CSV file
		String filePath = "employees.csv";

		int recordCount = 0;
		boolean isHeader = true;

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Increment count for each data row
				recordCount++;
			}

			// Print total number of records
			System.out.println("Total number of records (excluding header): " + recordCount);

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
