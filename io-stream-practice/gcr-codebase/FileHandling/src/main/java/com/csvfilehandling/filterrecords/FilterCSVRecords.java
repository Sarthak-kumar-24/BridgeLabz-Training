package com.csvfilehandling.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//------------------------------------------------------------
//Program Name : FilterCSVRecords
//Description  : This program reads student data from a CSV
//           file and prints only those students who have
//           scored more than 80 marks.
//CSV File     : students.csv
//Author       : Your Name
//------------------------------------------------------------

public class FilterCSVRecords {

	public static void main(String[] args) {

		// Path of the CSV file
		String filePath = "students.csv";

		boolean isHeader = true;

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			System.out.println("Students scoring more than 80 marks");
			System.out.println("----------------------------------");

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Split CSV line into individual fields
				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);
				int marks = Integer.parseInt(data[3]);

				// Apply filtering condition
				if (marks > 80) {
					System.out.println("ID    : " + id);
					System.out.println("Name  : " + name);
					System.out.println("Age   : " + age);
					System.out.println("Marks : " + marks);
					System.out.println();
				}
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
