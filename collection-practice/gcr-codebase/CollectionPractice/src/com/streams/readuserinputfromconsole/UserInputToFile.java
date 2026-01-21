package com.streams.readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * UserInputToFile
 *
 * This program reads user input from the console using BufferedReader and
 * writes the collected information into a text file using FileWriter.
 *
 * Inputs taken: - Name - Age - Favorite Programming Language
 */
public class UserInputToFile {

	public static void main(String[] args) {

		// BufferedReader for reading input from console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// File name where data will be stored
		String fileName = "user_info.txt";

		try {
			// Read user name
			System.out.print("Enter your name: ");
			String name = br.readLine();

			// Read user age
			System.out.print("Enter your age: ");
			int age = Integer.parseInt(br.readLine());

			// Read favorite programming language
			System.out.print("Enter your favorite programming language: ");
			String language = br.readLine();

			// FileWriter to write data into file
			// If file does not exist, it will be created automatically
			FileWriter writer = new FileWriter(fileName);

			// Writing data into file
			writer.write("User Details\n");
			writer.write("------------\n");
			writer.write("Name: " + name + "\n");
			writer.write("Age: " + age + "\n");
			writer.write("Favorite Language: " + language + "\n");

			// Closing FileWriter
			writer.close();

			System.out.println("\n User information saved successfully to " + fileName);

		} catch (NumberFormatException e) {
			// Handles invalid age input
			System.out.println(" Invalid age entered. Please enter a number.");

		} catch (IOException e) {
			// Handles input/output exceptions
			System.out.println(" I/O Error occurred: " + e.getMessage());
		}
	}

}
