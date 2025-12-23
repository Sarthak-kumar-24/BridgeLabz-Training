import java.util.Scanner;

/**
 * created a class named FirstNonRepeatingCharacter that
 * finds the first non-repeating character in a string.
 * A non-repeating character is one that occurs exactly once.
 */
public class FirstNonRepeatingCharacter {

  
     //Finds the first non-repeating character in a string.

    public static char findFirstNonRepeatingCharacter(String text) {

        int[] frequency = new int[256]; // ASCII characters

        // Step ii: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Step iii: Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Finding first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Displaying result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
