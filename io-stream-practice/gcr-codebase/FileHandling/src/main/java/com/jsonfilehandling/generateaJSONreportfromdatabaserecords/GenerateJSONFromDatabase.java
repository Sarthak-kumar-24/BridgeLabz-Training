package com.jsonfilehandling.generateaJSONreportfromdatabaserecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;

//------------------------------------------------------------
//Program Name : GenerateJSONFromDatabase
//Description  : Fetches employee records from database and
//           generates a JSON report using Core Java.
//Author       : Your Name
//------------------------------------------------------------

public class GenerateJSONFromDatabase {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/companydb";
		String username = "root";
		String password = "password";

		String jsonFile = "employees.json";

		try (Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
				BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {

			StringBuilder json = new StringBuilder();
			json.append("[\n");

			boolean first = true;

			while (rs.next()) {

				if (!first) {
					json.append(",\n");
				}
				first = false;

				json.append("  {\n");
				json.append("    \"id\": ").append(rs.getInt("id")).append(",\n");
				json.append("    \"name\": \"").append(rs.getString("name")).append("\",\n");
				json.append("    \"department\": \"").append(rs.getString("department")).append("\",\n");
				json.append("    \"salary\": ").append(rs.getInt("salary")).append("\n");
				json.append("  }");
			}

			json.append("\n]");

			// Write JSON to file
			bw.write(json.toString());

			System.out.println("JSON report generated successfully.");

		} catch (Exception e) {
			System.out.println("Error generating JSON report: " + e.getMessage());
		}
	}
}
