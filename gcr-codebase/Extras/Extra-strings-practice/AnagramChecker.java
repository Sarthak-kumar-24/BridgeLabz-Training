import java.util.Scanner;

/*
  Class Name: AnagramChecker
  Accepts two strings from the user and checks
 whether they are anagrams of each other.
 */

public class AnagramChecker {

     // Checks if two strings are anagrams.
    public static boolean areAnagrams(String first, String second) {


        first = first.replace(" ", "").toLowerCase();
        second = second.replace(" ", "").toLowerCase();

        // Length checking
        if (first.length() != second.length()) {
            return false;
        }

        int[] frequency = new int[256]; // ASCII characters

        // Counts characters from first string
        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
        }

        // Subtract using second string
        for (int i = 0; i < second.length(); i++) {
            frequency[second.charAt(i)]--;

            // If count goes negative, not an anagram
            if (frequency[second.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        if (areAnagrams(first, second)) {
            System.out.println("The strings are ANAGRAMS.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
