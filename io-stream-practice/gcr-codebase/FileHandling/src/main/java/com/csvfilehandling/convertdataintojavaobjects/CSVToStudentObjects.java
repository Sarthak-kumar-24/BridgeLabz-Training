package com.csvfilehandling.convertdataintojavaobjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//------------------------------------------------------------
//Program Name : CSVToStudentObjects
//Description  : This program reads student data from a CSV
//           file, converts each row into a Student object,
//           stores the objects in a List, and prints them.
//CSV File     : students.csv
//Author       : Your Name
//------------------------------------------------------------

public class CSVToStudentObjects {

	public static void main(String[] args) {

		String filePath = "O:\\New folder\\students.csv";
		List<Student> students = new ArrayList<>();
		boolean isHeader = true;

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

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);
				int marks = Integer.parseInt(data[3]);

				// Create Student object and add to list
				students.add(new Student(id, name, age, marks));
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		}

		// Print all Student objects
		System.out.println("Student List");
		System.out.println("------------");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
