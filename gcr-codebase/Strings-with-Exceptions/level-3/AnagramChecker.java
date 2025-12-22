import java.util.Scanner;

/**
 * Class Name: AnagramChecker
 * This program checks whether two given texts are anagrams.
 * Two texts are anagrams if they contain the same characters
 * with the same frequencies, but possibly in a different order.
 */
public class AnagramChecker {

   
     // Checks whether two texts are anagrams.
   
    public static boolean areAnagrams(String text1, String text2) {

        // Length check
        if (text1.length() != text2.length()) {
            return false;
        }

        // Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //  Count character frequencies
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Anagram check
        boolean result = areAnagrams(text1, text2);

        // Displaying result
        if (result) {
            System.out.println("The given texts are ANAGRAMS.");
        } else {
            System.out.println("The given texts are NOT anagrams.");
        }

        sc.close();
    }
}
