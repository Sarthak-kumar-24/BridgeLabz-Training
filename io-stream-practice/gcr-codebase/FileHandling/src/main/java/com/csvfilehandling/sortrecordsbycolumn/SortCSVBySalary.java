package com.csvfilehandling.sortrecordsbycolumn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//------------------------------------------------------------
//Program Name : SortCSVBySalary
//Description  : This program reads employee data from a CSV
//           file, sorts the records by salary in descending
//           order, and prints the top 5 highest-paid
//           employees.
//CSV File     : employees.csv
//Author       : Your Name
//------------------------------------------------------------

public class SortCSVBySalary {

	public static void main(String[] args) {

		String filePath = "employees.csv";
		List<Employee> employees = new ArrayList<>();
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
				String department = data[2];
				int salary = Integer.parseInt(data[3]);

				// Add employee object to list
				employees.add(new Employee(id, name, department, salary));
			}

			// Sort employees by salary in descending order
			Collections.sort(employees, Comparator.comparingInt(e -> -e.salary));

			// Print top 5 highest-paid employees
			System.out.println("Top 5 Highest-Paid Employees");
			System.out.println("-----------------------------");

			for (int i = 0; i < Math.min(5, employees.size()); i++) {
				Employee e = employees.get(i);
				System.out.println("ID         : " + e.id);
				System.out.println("Name       : " + e.name);
				System.out.println("Department : " + e.department);
				System.out.println("Salary     : " + e.salary);
				System.out.println();
			}

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
