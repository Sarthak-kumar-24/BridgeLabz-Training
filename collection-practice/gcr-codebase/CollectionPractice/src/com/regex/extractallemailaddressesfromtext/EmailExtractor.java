package com.regex.extractallemailaddressesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * EmailExtractor
 * --------------
 * Extracts all email addresses from a given text
 * using regular expressions.
 */
public class EmailExtractor {

    // Method to extract and print emails
    public static void extractEmails(String text) {

        // Regex pattern for email matching
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Compile the regex
        Pattern pattern = Pattern.compile(regex);

        // Create matcher object
        Matcher matcher = pattern.matcher(text);

        System.out.println("\n Extracted Email Addresses:");

        boolean found = false;

        // Find all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no email found
        if (!found) {
            System.out.println("No email addresses found.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Extract emails
        extractEmails(text);

        sc.close();
    }
}
