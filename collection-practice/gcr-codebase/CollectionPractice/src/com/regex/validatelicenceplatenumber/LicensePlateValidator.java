package com.regex.validatelicenceplatenumber;

import java.util.Scanner;

/*
 * LicensePlateValidator
 * -------------------------
 * Validates a license plate number based on format:
 * Two uppercase letters followed by four digits.
 * Example: AB1234 -> Valid
 */
public class LicensePlateValidator {

    // Method to validate license plate
    public static boolean isValidLicensePlate(String plate) {

        // Regex pattern for license plate
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // matches() checks if input follows the pattern
        return plate.matches(regex);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking license plate input
        System.out.print("Enter license plate number: ");
        String plate = sc.nextLine();

        // Validation result
        if (isValidLicensePlate(plate)) {
            System.out.println(" License plate is VALID");
        } else {
            System.out.println(" License plate is INVALID");
        }

        sc.close();
    }
}

