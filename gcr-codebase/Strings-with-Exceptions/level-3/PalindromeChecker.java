import java.util.Scanner;

/**
 * Class Name: PalindromeChecker
 * Description:
 * This program checks whether a given text is a palindrome
 * using three different approaches:
 * 1) Iterative comparison (start & end)
 * 2) Recursive comparison
 * 3) Character array comparison using reverse
 */
public class PalindromeChecker {

    //Checks palindrome using iteration.
    public static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }



    
    // Checks palindrome using recursion.
  
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }



    
     // Reverses a string using charAt().
     
    public static char[] reverseUsingCharAt(String text) {

        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }

        return reverse;
    }

    
    // Checks palindrome using character arrays.
  
    public static boolean isPalindromeUsingArrays(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(text);

        // Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeUsingArrays(text);

        // Displaying results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------------");
        System.out.println("Logic 1 (Iterative): " + result1);
        System.out.println("Logic 2 (Recursive): " + result2);
        System.out.println("Logic 3 (Array):     " + result3);

        sc.close();
    }
}
