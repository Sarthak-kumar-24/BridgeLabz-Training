package com.examresultuploader;

import java.util.*;
import java.io.*;

/**
 * ExamResultUploaderApp 
 * --------------------- 
 * Main driver class for
 * ExamResultUploader. Reads CSV file, validates records, and prints top
 * scorers.
 */
public class ExamResultUploaderApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter exam results CSV file path: ");
		String filePath = sc.nextLine();

		List<ExamRecord<String>> records = new ArrayList<>();

		try {
			List<String> lines = ResultFileReader.readFile(filePath);

			for (String line : lines) {

				try {
					// Validate format
					ResultValidator.validate(line);

					String[] parts = line.split(",");

					int roll = Integer.parseInt(parts[0]);
					String name = parts[1];
					String subject = parts[2];
					int marks = Integer.parseInt(parts[3]);

					records.add(new ExamRecord<>(roll, name, subject, marks, "Final"));

				} catch (InvalidResultFormatException e) {
					System.out.println("Skipping -> " + e.getMessage());
				}
			}

			// Analyze results
			ResultAnalyzer.analyze(records);

		} catch (IOException e) {
			System.out.println("File error: " + e.getMessage());
		}
	}
}
