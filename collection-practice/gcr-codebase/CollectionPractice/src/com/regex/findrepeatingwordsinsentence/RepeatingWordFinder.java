package com.regex.findrepeatingwordsinsentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * RepeatingWordFinder
 * -------------------
 * Finds repeating words in a sentence
 * using regex and backreferences.
 */
public class RepeatingWordFinder {

    // Method to find repeating words
    public static void findRepeatingWords(String text) {

        // Regex with backreference (case-insensitive)
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        // Compile pattern (CASE_INSENSITIVE)
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Matcher object
        Matcher matcher = pattern.matcher(text);

        // To avoid duplicate outputs
        Set<String> repeatedWords = new LinkedHashSet<>();

        // Find repeating words
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1).toLowerCase());
        }

        // Output result
        if (repeatedWords.isEmpty()) {
            System.out.println("No repeating words found.");
        } else {
            System.out.println(String.join(", ", repeatedWords));
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input sentence
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Find repeating words
        findRepeatingWords(sentence);

        sc.close();
    }
}
