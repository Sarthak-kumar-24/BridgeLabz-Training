import java.util.Scanner;

/**
 * Class Name: MaximumOfThreeNumbers
 * Accepts three integers from the user and finds
 * the maximum among them using modular methods.
 */
public class MaximumOfThreeNumbers {

    // Method to take integer input from user
    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Method to calculate maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");

        // Finding maximum
        int maximum = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("Maximum of the three numbers is: " + maximum);

        sc.close();
    }
}
