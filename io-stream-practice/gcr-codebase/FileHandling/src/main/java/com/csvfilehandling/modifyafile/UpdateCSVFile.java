package com.csvfilehandling.modifyafile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//------------------------------------------------------------

//Program Name : UpdateCSVFile
//Description  : This program reads employee data from a CSV
//           file, increases the salary of employees from
//           the IT department by 10%, and writes the
//           updated data to a new CSV file.
//Input File   : employees.csv
//Output File  : updated_employees.csv
//Author       : Your Name
//------------------------------------------------------------

public class UpdateCSVFile {

	public static void main(String[] args) {

		String inputFile = "employees.csv";
		String outputFile = "updated_employees.csv";

		boolean isHeader = true;

		// Try-with-resources ensures files are closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			String line;

			// Read input CSV line by line
			while ((line = br.readLine()) != null) {

				// Write header row directly
				if (isHeader) {
					bw.write(line);
					bw.newLine();
					isHeader = false;
					continue;
				}

				// Split CSV line into fields
				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				String department = data[2];
				double salary = Double.parseDouble(data[3]);

				// Increase salary by 10% if department is IT
				if (department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}

				// Write updated record to new CSV file
				bw.write(id + "," + name + "," + department + "," + (int) salary);
				bw.newLine();
			}

			System.out.println("CSV file updated successfully!");

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error processing file: " + e.getMessage());
		}
	}
}
