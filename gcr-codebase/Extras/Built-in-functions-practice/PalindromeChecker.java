import java.util.Scanner;

/**
 * Class Name: PalindromeChecker
 * Checks whether a given string is a palindrome
 * using modular functions.
 */
public class PalindromeChecker {

    // Method to take input from user
    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String text) {

        // Normalize case
        text = text.toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        // Compares characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method to display result
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        String text = getInput(sc);

        //Palindrome check
        boolean result = isPalindrome(text);

        //Display result
        displayResult(text, result);

        sc.close();
    }
}
