package com.csvfilehandling.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

//------------------------------------------------------------
//Program Name : DetectDuplicateCSVRecords
//Description  : This program reads a CSV file and detects
//           duplicate records based on the ID column.
//           All duplicate rows are printed.
//CSV File     : students.csv
//Author       : Your Name
//------------------------------------------------------------

public class DetectDuplicateCSVRecords {

	public static void main(String[] args) {

		String filePath = "O:\\New folder\\students.csv";
		boolean isHeader = true;

		// Set to store unique IDs
		Set<String> seenIds = new HashSet<>();

		System.out.println("Duplicate Records Found");
		System.out.println("-----------------------");

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV line into fields
				String[] data = line.split(",");

				String id = data[0];

				// If ID already exists, it's a duplicate
				if (seenIds.contains(id)) {
					System.out.println("Duplicate Row: " + line);
				} else {
					seenIds.add(id);
				}
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading CSV file: " + e.getMessage());
		}
	}
}
