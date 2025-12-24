import java.util.Scanner;

/**
 * Class Name: FactorialUsingRecursion
 * Calculates the factorial of a number using
 * a recursive function with modular design.
 */
public class FactorialUsingRecursion {

    // Method to take input from user
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int number) {

        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }

    // Method to display result
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input
        int number = getInput(sc);

        // Validates input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        //Calculation
        long result = factorial(number);

        // Output
        displayResult(number, result);

        sc.close();
    }
}
