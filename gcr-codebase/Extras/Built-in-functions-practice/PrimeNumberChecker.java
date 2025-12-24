import java.util.Scanner;

/**
 * Class Name: PrimeNumberChecker
 * Checks whether a given number is a prime number
 * using a separate method.
 */
public class PrimeNumberChecker {


    // Checks if a number is prime.

    public static boolean isPrime(int number) {

        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Checks divisibility up to square root of number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // divisor found
            }
        }

        return true; // no divisors found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling prime check method
        if (isPrime(number)) {
            System.out.println(number + " is a PRIME number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }

        sc.close();
    }
}
