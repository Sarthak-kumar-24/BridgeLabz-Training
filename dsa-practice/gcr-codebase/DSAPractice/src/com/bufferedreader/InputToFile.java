package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

/* Read User Input and Write to File Using InputStreamReader
 * 
 * 
 * a program that uses InputStreamReader to read user input from the console and write the input to a file. 
 * Each input should be written as a new line in the file.
 */
public class InputToFile {

	public static void main(String[] args) {


		String filePath = "E:\\DSA_Questions( Java )\\Array\\2)Delete.cpp";

	       try {
	            // Reads user input (byte → char)
	            InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);

	            // Writes to file
	            FileWriter fw = new FileWriter(filePath);

	            System.out.println("Enter text (type 'exit' to stop):");

	            String line;

	            while (true) {
	                line = br.readLine();

	                if (line.equalsIgnoreCase("exit")) {
	                    break;
	                }

	                fw.write(line + System.lineSeparator());
	            }

	            fw.close();
	            br.close();

	            System.out.println("Input successfully written to file.");

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
