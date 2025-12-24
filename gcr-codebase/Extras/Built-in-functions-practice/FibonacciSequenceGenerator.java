import java.util.Scanner;

/**
 * Class Name: FibonacciSequenceGenerator
 * Generates the Fibonacci sequence up to a specified
 * number of terms using a separate method.
 */
public class FibonacciSequenceGenerator {


    // Generates and prints Fibonacci sequence.

    public static void generateFibonacci(int terms) {

        // Handle invalid input
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Sequence: ");

        // Generates Fibonacci terms
        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Generates Fibonacci sequence
        generateFibonacci(terms);

        sc.close();
    }
}
