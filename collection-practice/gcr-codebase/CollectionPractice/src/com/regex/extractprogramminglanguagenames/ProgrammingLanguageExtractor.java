package com.regex.extractprogramminglanguagenames;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ProgrammingLanguageExtractor
 * -----------------------------
 * Extracts programming language names
 * from a given text using regex.
 */
public class ProgrammingLanguageExtractor {

    // Method to extract programming languages
    public static void extractLanguages(String text) {

        // Regex pattern for known programming languages
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|C|Ruby|PHP)\\b";

        // Compile pattern (case-sensitive as per example)
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(text);

        System.out.println("\n Programming Languages Found:");

        boolean found = false;

        // Find all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no language found
        if (!found) {
            System.out.println("No programming languages found.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Extract programming languages
        extractLanguages(text);

        sc.close();
    }
}
