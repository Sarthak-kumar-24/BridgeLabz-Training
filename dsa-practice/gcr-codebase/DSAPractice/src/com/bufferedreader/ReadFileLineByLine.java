package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Read a File Line by Line Using FileReader
 * 
 * a program that uses FileReader to read a text file line by line and print each line to the console.
 */
public class ReadFileLineByLine {
	public static void main(String[] args) {

		String filePath = "E:\\DSA_Questions( Java )\\Array\\2)Delete.cpp";

		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}

}
