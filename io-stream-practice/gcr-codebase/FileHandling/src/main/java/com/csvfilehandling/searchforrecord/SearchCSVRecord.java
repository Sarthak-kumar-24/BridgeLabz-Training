package com.csvfilehandling.searchforrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//------------------------------------------------------------
//Program Name : SearchCSVRecord
//Description  : This program reads an employees CSV file and
//           searches for an employee by name. If found,
//           it prints the employee's department and salary.
//CSV File     : employees.csv
//Author       : Your Name
//------------------------------------------------------------

public class SearchCSVRecord {

	public static void main(String[] args) {

		// Path of the CSV file
		String filePath = "O:\\New folder\\students.csv";

		// Scanner to take user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee name to search: ");
		String searchName = scanner.nextLine();

		boolean isHeader = true;
		boolean isFound = false;

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

				// Split CSV line into fields
				String[] data = line.split(",");

				String name = data[1];

				// Check if employee name matches (case-insensitive)
				if (name.equalsIgnoreCase(searchName)) {

					String department = data[2];
					String salary = data[3];

					System.out.println("\nEmployee Found!");
					System.out.println("----------------");
					System.out.println("Name       : " + name);
					System.out.println("Department : " + department);
					System.out.println("Salary     : " + salary);

					isFound = true;
					break;
				}
			}

			// If no matching employee is found
			if (!isFound) {
				System.out.println("\nEmployee not found.");
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
