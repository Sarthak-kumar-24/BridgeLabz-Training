package com.streams.readalargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * LargeFileErrorScanner
 *
 * This program efficiently reads a very large text file
 * line by line and prints only those lines that contain
 * the word "error" (case-insensitive).
 *
 * It is designed to handle large files (500MB+)
 * without causing memory issues.
 */
public class LargeFileErrorScanner {
	   public static void main(String[] args) {

	        // Path of the large log/text file
	        String filePath = "large_log_file.txt";

	        System.out.println("===== Scanning File for Errors =====\n");

	        // Try-with-resources ensures BufferedReader is closed properly
	        try (
	            // FileReader reads characters from file
	            FileReader fr = new FileReader(filePath);

	            // BufferedReader enables efficient line-by-line reading
	            BufferedReader br = new BufferedReader(fr)
	        ) {
	            String line;
	            int lineNumber = 1;

	            // Read file line by line
	            while ((line = br.readLine()) != null) {

	                // Convert line to lowercase for case-insensitive comparison
	                if (line.toLowerCase().contains("error")) {
	                    // Print line number and content
	                    System.out.println("Line " + lineNumber + ": " + line);
	                }

	                lineNumber++;
	            }

	            System.out.println("\n File scanning completed.");

	        } catch (IOException e) {
	            // Handles file-not-found and other I/O errors
	            System.out.println(" I/O Error occurred: " + e.getMessage());
	        }
	    }

}
