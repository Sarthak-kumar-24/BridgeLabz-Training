package com.csvfilehandling.readlargefileeficiently;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//------------------------------------------------------------
//Program Name : ReadLargeCSVInChunks
//Description  : This program reads a large CSV file in a
//           memory-efficient way by processing only
//           100 lines at a time and displays the count
//           of records processed.
//CSV File     : large_data.csv
//Author       : Your Name
//------------------------------------------------------------

public class ReadLargeCSVInChunks {

	private static final int CHUNK_SIZE = 100;

	public static void main(String[] args) {

		String filePath = "large_data.csv";
		boolean isHeader = true;
		int totalRecordsProcessed = 0;

		// Temporary list to store a chunk of records
		List<String> chunk = new ArrayList<>(CHUNK_SIZE);

		// Try-with-resources ensures file is closed automatically
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Read file line by line (streaming)
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				// Add line to current chunk
				chunk.add(line);

				// If chunk size reaches 100, process it
				if (chunk.size() == CHUNK_SIZE) {
					processChunk(chunk);
					totalRecordsProcessed += chunk.size();
					chunk.clear(); // clear memory
				}
			}

			// Process remaining records if any
			if (!chunk.isEmpty()) {
				processChunk(chunk);
				totalRecordsProcessed += chunk.size();
				chunk.clear();
			}

			// Display total records processed
			System.out.println("Total records processed: " + totalRecordsProcessed);

		} catch (IOException e) {
			// Handle file-related errors
			System.out.println("Error reading large CSV file: " + e.getMessage());
		}
	}

	// Method to process each chunk of records
	private static void processChunk(List<String> chunk) {
		// Simulate processing logic
		System.out.println("Processing chunk of size: " + chunk.size());

		// Example: just prints first record of the chunk
		System.out.println("Sample record: " + chunk.get(0));
	}
}
