package com.regex.validatehexcolorcode;

import java.util.Scanner;

/*
 * HexColorValidator
 * -----------------
 * Validates a hex color code.
 * Format: # followed by 6 hexadecimal characters
 * Example: #FFA500, #ffa500
 */
public class HexColorValidator {

    // Method to validate hex color
    public static boolean isValidHexColor(String color) {

        // Regex for hex color validation
        String regex = "^#[0-9A-Fa-f]{6}$";

        // matches() checks full string match
        return color.matches(regex);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking hex color input
        System.out.print("Enter hex color code: ");
        String color = sc.nextLine();

        // Validation result
        if (isValidHexColor(color)) {
            System.out.println(" Hex color code is VALID");
        } else {
            System.out.println(" Hex color code is INVALID");
        }

        sc.close();
    }
}
