package com.regex.replacemultiplespaceswithsinglespace;
import java.util.Scanner;

/*
 * SpaceNormalizer
 * ----------------
 * Replaces multiple spaces in a sentence
 * with a single space.
 */
public class SpaceNormalizer {

    // Method to normalize spaces
    public static String normalizeSpaces(String text) {

        // Replace one or more whitespace characters with a single space
        return text.replaceAll("\\s+", " ").trim();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text
        System.out.println("Enter text:");
        String input = sc.nextLine();

        // Normalize spaces
        String output = normalizeSpaces(input);

        // Display result
        System.out.println("\nNormalized Text:");
        System.out.println(output);

        sc.close();
    }
}
