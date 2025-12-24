import java.util.Scanner;

/**
 * Class Name: BasicCalculator
 * Performs basic arithmetic operations using
 * separate modular functions.
 */
public class BasicCalculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Displays result
    public static void displayResult(String operation, double result) {
        System.out.println(operation + " result: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");

        int choice = sc.nextInt();

        try {
            switch (choice) {

                case 1:
                    displayResult("Addition", add(num1, num2));
                    break;

                case 2:
                    displayResult("Subtraction", subtract(num1, num2));
                    break;

                case 3:
                    displayResult("Multiplication", multiply(num1, num2));
                    break;

                case 4:
                    displayResult("Division", divide(num1, num2));
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
