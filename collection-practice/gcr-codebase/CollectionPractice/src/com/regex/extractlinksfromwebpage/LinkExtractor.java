package com.regex.extractlinksfromwebpage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * LinkExtractor
 * -------------
 * Extracts all HTTP/HTTPS links from a given text.
 */
public class LinkExtractor {

    // Method to extract links
    public static void extractLinks(String text) {

        // Regex for extracting URLs
        String regex = "https?://\\S+";

        // Compile the regex
        Pattern pattern = Pattern.compile(regex);

        // Create matcher
        Matcher matcher = pattern.matcher(text);

        System.out.println("\n Links Found:");

        boolean found = false;

        // Find all links
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        // If no links found
        if (!found) {
            System.out.println("No links found.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input text
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Extract links
        extractLinks(text);

        sc.close();
    }
}
