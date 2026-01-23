package com.regex.extractallcapitalizedwordsfromsentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * CapitalizedWordExtractor
 * ------------------------
 * Extracts all capitalized words from a given sentence.
 * A capitalized word starts with an uppercase letter
 * followed by lowercase letters.
 */
public class CapitalizedWordExtractor {

    // Method to extract capitalized words
    public static void extractCapitalizedWords(String sentence) {

        // Regex pattern for capitalized words
        String regex = "\\b[A-Z][a-z]+\\b";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("\n Capitalized Words Found:");

        boolean found = false;

        // Find all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no capitalized words found
        if (!found) {
            System.out.println("No capitalized words found.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Extract capitalized words
        extractCapitalizedWords(sentence);

        sc.close();
    }
}
