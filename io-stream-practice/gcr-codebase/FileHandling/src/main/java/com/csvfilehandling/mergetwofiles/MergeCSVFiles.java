package com.csvfilehandling.mergetwofiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//------------------------------------------------------------
//Program Name : MergeCSVFiles
//Description  : This program merges two CSV files based on
//           a common ID and creates a new CSV file
//           containing all student details.
//Input Files  : students1.csv, students2.csv
//Output File  : merged_students.csv
//Author       : Your Name
//------------------------------------------------------------

public class MergeCSVFiles {

	public static void main(String[] args) {

		String file1 = "students1.csv";
		String file2 = "students2.csv";
		String outputFile = "merged_students.csv";

		// Map to store ID -> Name,Age
		Map<Integer, String[]> studentDetails = new HashMap<>();

		// Read first CSV (ID, Name, Age)
		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

			String line;
			boolean isHeader = true;

			while ((line = br1.readLine()) != null) {

				// Skip header
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				String age = data[2];

				studentDetails.put(id, new String[] { name, age });
			}

		} catch (IOException e) {
			System.out.println("Error reading first file: " + e.getMessage());
			return;
		}

		// Read second CSV and merge with first
		try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			boolean isHeader = true;

			// Write header for merged CSV
			bw.write("ID,Name,Age,Marks,Grade");
			bw.newLine();

			while ((line = br2.readLine()) != null) {

				// Skip header
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String marks = data[1];
				String grade = data[2];

				// Merge data if ID exists in first file
				if (studentDetails.containsKey(id)) {
					String[] details = studentDetails.get(id);
					bw.write(id + "," + details[0] + "," + details[1] + "," + marks + "," + grade);
					bw.newLine();
				}
			}

			System.out.println("CSV files merged successfully!");

		} catch (IOException e) {
			System.out.println("Error merging files: " + e.getMessage());
		}
	}
}
