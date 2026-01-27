package com.markmate;

//Import File class for file handling
import java.io.File;
//Import collections
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.MappingIterator;
//Import Jackson core classes
import com.fasterxml.jackson.databind.ObjectMapper;
//Import Jackson CSV classes
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

/**
 * MarkMate reads student marks from CSV, processes them, and exports JSON
 * report cards.
 */
public class MarkMate {

	/**
	 * Main method – execution starts here
	 */
	public static void main(String[] args) {

		try {
			// Create CSV mapper for reading CSV files
			CsvMapper csvMapper = new CsvMapper();

			// Define schema assuming first row is header
			CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();

			// Read CSV file into iterator
			MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class).with(csvSchema)
					.readValues(new File("marks.csv"));

			// List to store final student reports
			List<StudentReport> reports = new ArrayList<>();

			// Process each student record
			while (iterator.hasNext()) {

				// Read one row from CSV
				Map<String, String> row = iterator.next();

				// Extract student name
				String name = row.get("name");

				int total = 0;
				int subjectCount = 0;
				boolean invalidData = false;

				// Loop through subject marks
				for (Map.Entry<String, String> entry : row.entrySet()) {

					// Skip name column
					if (entry.getKey().equals("name")) {
						continue;
					}

					try {
						// Convert marks to integer
						int marks = Integer.parseInt(entry.getValue());
						total += marks;
						subjectCount++;
					} catch (NumberFormatException e) {
						// Handle invalid marks
						invalidData = true;
						System.out.println(" Invalid marks for student: " + name);
						break;
					}
				}

				// Skip student if invalid data found
				if (invalidData) {
					continue;
				}

				// Calculate average
				double average = (double) total / subjectCount;

				// Determine grade
				String grade = calculateGrade(average);

				// Create student report
				reports.add(new StudentReport(name, total, average, grade));
			}

			// Create ObjectMapper for JSON export
			ObjectMapper jsonMapper = new ObjectMapper();

			// Write JSON output to file
			jsonMapper.writerWithDefaultPrettyPrinter().writeValue(new File("report.json"), reports);

			System.out.println("JSON report generated successfully");

		} catch (Exception e) {
			// Handle file or processing errors
			e.printStackTrace();
		}
	}

	/**
	 * Determines grade based on average marks
	 */
	private static String calculateGrade(double average) {

		if (average >= 90)
			return "A";
		if (average >= 75)
			return "B";
		if (average >= 60)
			return "C";
		return "D";
	}
}
