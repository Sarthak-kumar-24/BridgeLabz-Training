package com.regex.censorbadwordsinsentence;

import java.util.Scanner;

/*
 * BadWordCensor
 * -------------
 * Replaces bad words in a sentence with ****
 * using regular expressions.
 */
public class BadWordCensor {

    // Method to censor bad words
    public static String censorBadWords(String text, String[] badWords) {

        // Join bad words with | to create regex group
        String pattern = "\\b(" + String.join("|", badWords) + ")\\b";

        // Replace bad words with **** (case-insensitive)
        return text.replaceAll("(?i)" + pattern, "****");
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // List of bad words (can be extended)
        String[] badWords = { "damn", "stupid" };

        // Censoring sentence
        String censoredText = censorBadWords(sentence, badWords);

        // Display result
        System.out.println("\nCensored Output:");
        System.out.println(censoredText);

        sc.close();
    }
}
