package com.regex.validatessn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * SSNValidator
 * ------------
 * Validates and extracts a Social Security Number (SSN)
 * in the format XXX-XX-XXXX.
 */
public class SSNValidator {

    // Method to validate SSN inside a text
    public static void validateSSN(String text) {

        // Regex for SSN format
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile pattern
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        // Find SSN
        while (matcher.find()) {
            System.out.println(" \"" + matcher.group() + "\" is valid");
            found = true;
        }

        // If no valid SSN found
        if (!found) {
            System.out.println(" No valid SSN found");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Validate SSN
        validateSSN(text);

        sc.close();
    }
}

