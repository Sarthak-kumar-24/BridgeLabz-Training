package com.bufferedreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
 * Convert Byte Stream to Character Stream Using InputStreamReader
 * 
 * a program that uses InputStreamReader to read binary data from a file and print it as characters. 
 * The file contains data encoded in a specific charset (e.g., UTF-8).
 * 
 */
public class ByteStreamtoCharacterStream {

	public static void main(String[] args) {


		String filePath = "E:\\DSA_Questions( Java )\\Array\\2)Delete.cpp";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			InputStreamReader isr =new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			
			while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
			
			br.close(); 
			
			
			
		}catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

	}

}
