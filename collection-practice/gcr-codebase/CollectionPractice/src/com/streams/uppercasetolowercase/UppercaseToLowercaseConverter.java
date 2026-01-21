package com.streams.uppercasetolowercase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * UppercaseToLowercaseConverter
 *
 * This program reads text from a source file, converts all uppercase characters
 * to lowercase, and writes the converted content into a destination file.
 *
 * It uses: - FileReader & FileWriter (character streams) - BufferedReader &
 * BufferedWriter (for efficiency) - Proper exception handling
 */
public class UppercaseToLowercaseConverter {

	public static void main(String[] args) {

		// Source and destination file names
		String sourceFile = "input.txt";
		String destinationFile = "output.txt";

		// Try-with-resources ensures streams are closed automatically
		try (
				// FileReader reads characters from file
				FileReader fr = new FileReader(sourceFile);

				// BufferedReader improves reading efficiency
				BufferedReader br = new BufferedReader(fr);

				// FileWriter writes characters to file
				FileWriter fw = new FileWriter(destinationFile);

				// BufferedWriter improves writing efficiency
				BufferedWriter bw = new BufferedWriter(fw)) {
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Convert line to lowercase (handles character encoding properly)
				String lowerCaseLine = line.toLowerCase();

				// Write converted line to output file
				bw.write(lowerCaseLine);
				bw.newLine(); // preserve line breaks
			}

			System.out.println(" File converted successfully.");
			System.out.println("Uppercase letters changed to lowercase.");

		} catch (IOException e) {
			// Handles file not found and other I/O errors
			System.out.println(" I/O Error occurred: " + e.getMessage());
		}
	}

}
