package com.csvfilehandling.writetoafile;

//------------------------------------------------------------
//Program Name : WriteCSV
//Description  : This program creates a CSV file and writes
//             employee details (ID, Name, Department, Salary)
//             into it.
//CSV File     : employees.csv
//Author       : Your Name
//------------------------------------------------------------

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Main class to write employee data into a CSV file
public class WriteCSV {

	// Main method - program execution starts here
	public static void main(String[] args) {

		// Name of the CSV file to be created
		String filePath = "employees.csv";

		// Try-with-resources ensures the file is closed automatically
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			// Writing header row
			bw.write("ID,Name,Department,Salary");
			bw.newLine();

			// Writing employee records
			bw.write("201,Rahul,IT,55000");
			bw.newLine();

			bw.write("202,Anita,HR,48000");
			bw.newLine();

			bw.write("203,Suresh,Finance,62000");
			bw.newLine();

			bw.write("204,Priya,Marketing,50000");
			bw.newLine();

			bw.write("205,Karan,Operations,58000");
			bw.newLine();

			System.out.println("Employee data successfully written to CSV file.");

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}
}
