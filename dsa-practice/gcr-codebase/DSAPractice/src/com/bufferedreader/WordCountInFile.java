package com.bufferedreader;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;


/*  Count the Occurrence of a Word in a File Using FileReader
 * 
 *  a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
 * 
 * 
 */
public class WordCountInFile {

	public static void main(String[] args) {
		
		
		String filePath = "E:\\DSA_Questions( Java )\\Array\\2)Delete.cpp";
		
		String targetWord = "std";
		
		int count =0;
		
		try {
			FileReader fr = new FileReader( filePath);
			BufferedReader br = new BufferedReader( fr);
			
			String line;
			
			while( ( line = br.readLine()) != null) {
				
				String[] words = line.split("\\s+");
				
				for( String word: words) {
					if( word.equalsIgnoreCase(targetWord)) {
						count++;
					}
				}
			}
			br.close();
			System.out.println("Word \"" + targetWord + "\" occurs " + count + " times.");
			
		} catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

	}

}
