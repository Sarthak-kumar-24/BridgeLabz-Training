package com.feedbackguru;

import java.util.*;
import java.io.*;

/**
 * FeedbackGuruApp ---------------- Main driver class for the FeedbackGuru
 * system. Coordinates file reading, parsing, analysis, and displays categorized
 * feedback.
 */
public class FeedbackGuruApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter feedback folder path: ");
		String folderPath = sc.nextLine();

		try {
			// Reads feedback lines
			List<String> lines = FeedbackReader.readFeedbackFiles(folderPath);

			List<Feedback<String>> feedbackList = new ArrayList<>();

			// Parse each feedback line
			for (String line : lines) {
				feedbackList.add(FeedbackParser.parse(line));
			}

			// Analyze feedback
			Map<String, List<String>> categorized = FeedbackAnalyzer.analyze(feedbackList);

			// Display results
			System.out.println("\n===== FEEDBACK SUMMARY =====\n");

			for (Map.Entry<String, List<String>> entry : categorized.entrySet()) {

				System.out.println(entry.getKey() + " Feedback:");
				for (String msg : entry.getValue()) {
					System.out.println(" - " + msg);
				}
				System.out.println();
			}

		} catch (IOException e) {
			System.out.println("Error reading files: " + e.getMessage());
		}
	}
}
