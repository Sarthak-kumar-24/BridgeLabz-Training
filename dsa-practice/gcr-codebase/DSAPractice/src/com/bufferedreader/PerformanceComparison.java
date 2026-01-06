package com.bufferedreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
 * 
 * Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
 * Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
 */
public class PerformanceComparison {


		
	    private static final int ITERATIONS = 1_000_000;
	    private static final String TEST_STRING = "hello";
	    private static final String FILE_PATH = "E:\\\\DSA_Questions( Java )\\\\Array\\\\2)Delete.cpp"; // assume large file

	    public static void main(String[] args) {

	        // ===============================
	        // StringBuilder vs StringBuffer
	        // ===============================
	        System.out.println("===== STRING CONCATENATION TEST =====");

	        long startBuilder = System.nanoTime();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < ITERATIONS; i++) {
	            sb.append(TEST_STRING);
	        }
	        long endBuilder = System.nanoTime();

	        long startBuffer = System.nanoTime();
	        StringBuffer buffer = new StringBuffer();
	        for (int i = 0; i < ITERATIONS; i++) {
	            buffer.append(TEST_STRING);
	        }
	        long endBuffer = System.nanoTime();

	        System.out.println("StringBuilder Time : " +
	                (endBuilder - startBuilder) / 1_000_000 + " ms");
	        System.out.println("StringBuffer Time  : " +
	                (endBuffer - startBuffer) / 1_000_000 + " ms");

	        // ===============================
	        // FileReader vs InputStreamReader
	        // ===============================
	        System.out.println("\n===== FILE READING & WORD COUNT TEST =====");

	        // --- FileReader ---
	        long startFileReader = System.nanoTime();
	        int fileReaderWords = countWordsUsingFileReader(FILE_PATH);
	        long endFileReader = System.nanoTime();

	        // --- InputStreamReader ---
	        long startISR = System.nanoTime();
	        int isrWords = countWordsUsingInputStreamReader(FILE_PATH);
	        long endISR = System.nanoTime();

	        System.out.println("FileReader Word Count        : " + fileReaderWords);
	        System.out.println("FileReader Time              : " +
	                (endFileReader - startFileReader) / 1_000_000 + " ms");

	        System.out.println("InputStreamReader Word Count : " + isrWords);
	        System.out.println("InputStreamReader Time       : " +
	                (endISR - startISR) / 1_000_000 + " ms");
	    }

	    // ===============================
	    // Word count using FileReader
	    // ===============================
	    private static int countWordsUsingFileReader(String path) {
	        int count = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                if (!line.isBlank()) {
	                    count += words.length;
	                }
	            }

	        } catch (IOException e) {
	            System.out.println("FileReader Error: " + e.getMessage());
	        }
	        return count;
	    }

	    // ===============================
	    // Word count using InputStreamReader
	    // ===============================
	    private static int countWordsUsingInputStreamReader(String path) {
	        int count = 0;

	        try (BufferedReader br = new BufferedReader(
	                new InputStreamReader(
	                        new FileInputStream(path), StandardCharsets.UTF_8))) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.trim().split("\\s+");
	                if (!line.isBlank()) {
	                    count += words.length;
	                }
	            }

	        } catch (IOException e) {
	            System.out.println("InputStreamReader Error: " + e.getMessage());
	        }
	        return count;
		

	}

}
