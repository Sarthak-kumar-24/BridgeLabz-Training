import java.util.Scanner;

/**
 * Class Name: BMIFitnessTracker
 * This program calculates the Body Mass Index (BMI) for a client
 * based on height and weight, and determines the BMI category
 * using if-else conditions.
 */

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Maya's BMI Fitness Tracker ");

        // Taking height input (in meters)
        System.out.print("Enter height in meters: ");
        double heightInMeters = sc.nextDouble();

        // Taking weight input (in kilograms)
        System.out.print("Enter weight in kilograms: ");
        double weightInKilograms = sc.nextDouble();

        // Input validation
        if (heightInMeters <= 0 || weightInKilograms <= 0) {
            System.out.println("Invalid input. Height and weight must be positive values.");
            sc.close();
            return;
        }

        // BMI calculation
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Displays BMI value
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determines BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        sc.close();
    }
}
