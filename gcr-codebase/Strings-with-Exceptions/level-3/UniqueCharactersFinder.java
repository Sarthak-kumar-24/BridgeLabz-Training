import java.util.Scanner;

/**
 * created a class named  UniqueCharactersFinder that
 * finds and displays all unique characters in a string
 * using the charAt() method, without using length() for logic where restricted.
 */

public class UniqueCharactersFinder {

    
     //Finds the length of a string without using length().

    
    public static int findLengthWithoutLengthMethod(String text) {

        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    
      // Finds unique characters in a string using nested loops.
        public static char[] findUniqueCharacters(String text) {

        int length = findLengthWithoutLengthMethod(text);

        // Step i: Temporary array to store unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Step ii: Nested loop to check uniqueness
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar appeared earlier
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Step iii: Create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Finding unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Displaying result
        System.out.println("\nUnique characters in the string:");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
