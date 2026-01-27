package com.csvfilehandling.generateaCSVreportfromdatabase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//------------------------------------------------------------
//Program Name : GenerateCSVFromDatabase
//Description  : This program fetches employee records from a
//           database and writes them into a CSV file
//           with proper headers.
//CSV File     : employee_report.csv
//Author       : Your Name
//------------------------------------------------------------

public class GenerateCSVFromDatabase {

	public static void main(String[] args) {

		// Database connection details
		String url = "jdbc:mysql://localhost:3306/companydb";
		String username = "root";
		String password = "password";

		// Output CSV file
		String csvFile = "employee_report.csv";

		// SQL query to fetch employee data
		String query = "SELECT id, name, department, salary FROM employees";

		// Try-with-resources for automatic resource cleanup
		try (Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

			// Write CSV header
			bw.write("Employee ID,Name,Department,Salary");
			bw.newLine();

			// Process each database row
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String department = rs.getString("department");
				double salary = rs.getDouble("salary");

				// Write row to CSV
				bw.write(id + "," + name + "," + department + "," + salary);
				bw.newLine();
			}

			System.out.println("CSV report generated successfully!");

		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File writing error: " + e.getMessage());
		}
	}
}
