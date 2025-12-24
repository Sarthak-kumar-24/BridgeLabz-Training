import java.util.Scanner;

/**
 * Class Name: GCDAndLCMCalculator
 * Calculates the Greatest Common Divisor (GCD)
 * and Least Common Multiple (LCM) of two numbers
 * using modular methods.
 */
public class GCDAndLCMCalculator {

    // Method to take input from user
    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        // Ensures positive values
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        return Math.abs(a * b) / calculateGCD(a, b);
    }

    // Method to display result
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");

        // Calculations
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Output
        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}
