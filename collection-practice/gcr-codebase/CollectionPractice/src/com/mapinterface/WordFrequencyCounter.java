package com.mapinterface;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
=========================================================
Program: Word Frequency Counter
Purpose:
- Read a text file
- Count frequency of each word using HashMap
- Ignore case and punctuation
=========================================================
*/
public class WordFrequencyCounter {
	
	   // Method to count word frequencies from file
    private static Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> freqMap = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine()
                        .toLowerCase()                 // ignore case
                        .replaceAll("[^a-z ]", " ");   // remove punctuation

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        freqMap.put(word,
                                freqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(" File not found");
        }

        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text file path: ");
        String filePath = sc.nextLine();

        Map<String, Integer> result = countWords(filePath);

        System.out.println(" Word Frequency:");
        System.out.println(result);

        sc.close();
    }

}
