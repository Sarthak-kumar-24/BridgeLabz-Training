import java.util.Random;
import java.util.Scanner;

/**
 * Class Name: NumberGuessingGame
 * A number guessing game where the computer guesses
 * a number between 1 and 100 based on user feedback.
 */

public class NumberGuessingGame {

    // Generates a random guess within the given range
    public static int generateGuess(int low, int high,  Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    // Gets feedback from the user
    public static String getFeedback(Scanner sc) {
        System.out.print("Is the guess HIGH, LOW, or CORRECT? ");
        return sc.next().toLowerCase();
    }

    // Updates range based on feedback
    public static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1;
        } else if (feedback.equals("low")) {
            range[0] = guess + 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it ");
        System.out.println("Respond with: HIGH, LOW, or CORRECT\n");

        while (true) {

            int guess = generateGuess(low, high, random);
            attempts++;

            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("\n I guessed your number in " + attempts + " attempts!");
                break;
            }

            int[] range = { low, high };
            updateRange(feedback, guess, range);

            low = range[0];
            high = range[1];

            // Safety check
            if (low > high) {
                System.out.println("Check your answers!");
                break;
            }
        }

        sc.close();
    }
}
