import java.util.Scanner;

/**
 * Class Name: TemperatureConverter
 * Converts temperatures between Fahrenheit and Celsius
 * using separate modular functions.
 */
public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to display results
    public static void displayResult(String message, double value) {
        System.out.printf(message + ": %.2f%n", value);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsiusResult = fahrenheitToCelsius(fahrenheit);
                displayResult("Temperature in Celsius", celsiusResult);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheitResult = celsiusToFahrenheit(celsius);
                displayResult("Temperature in Fahrenheit", fahrenheitResult);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}
