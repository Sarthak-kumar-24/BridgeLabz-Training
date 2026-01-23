package com.exceptions.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

		public static void main(String[] args) {

		// Name of the file to be read
		String fileName = "data.txt";

		try {
			// FileReader opens the file
			// BufferedReader helps in reading data line by line
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String line;

			// Loop runs until end of file
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			// Close the file after reading
			br.close();

		} catch (IOException e) {
			// Handles checked exception if file does not exist
			// or any I/O error occurs
			System.out.println("File not found");
		}
	}
}