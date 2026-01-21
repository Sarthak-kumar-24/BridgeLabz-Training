package com.streams.countwordsinafile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WordFrequencyCounter
 *
 * This program: 1. Reads a text file using FileReader and BufferedReader 2.
 * Counts total number of words 3. Counts frequency of each word using HashMap
 * 4. Displays the top 5 most frequently occurring words
 */
public class WordFrequencyCounter {
	public static void main(String[] args) {

		// File to be processed
		String filePath = "input.txt";

		// HashMap to store word -> frequency
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		int totalWords = 0;

		// Try-with-resources to ensure file is closed properly
		try (FileReader fr = new FileReader(filePath); BufferedReader br = new BufferedReader(fr)) {
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Convert to lowercase to make counting case-insensitive
				line = line.toLowerCase();

				// Remove punctuation and split into words
				String[] words = line.split("\\W+");

				// Process each word
				for (String word : words) {
					if (!word.isEmpty()) {
						totalWords++;

						// Update frequency in HashMap
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}

		} catch (IOException e) {
			System.out.println(" Error reading file: " + e.getMessage());
			return;
		}

		// Convert map entries to a list for sorting
		List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());

		// Sort words by frequency in descending order
		wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

		// Display results
		System.out.println("===== Word Count Report =====\n");
		System.out.println("Total number of words: " + totalWords);

		System.out.println("\nTop 5 most frequent words:");
		int limit = Math.min(5, wordList.size());

		for (int i = 0; i < limit; i++) {
			Map.Entry<String, Integer> entry = wordList.get(i);
			System.out.println((i + 1) + ". " + entry.getKey() + " → " + entry.getValue());
		}
	}

}
