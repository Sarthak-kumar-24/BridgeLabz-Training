import java.util.Scanner;

/**
 * Created a class names  UniqueCharacterFrequencyFinder that
 * finds the frequency of characters in a string
 * by first identifying unique characters using nested loops
 * and then using an ASCII frequency array.
 */

public class UniqueCharacterFrequencyFinder {

    
    //Finds unique characters in a string using charAt() and nested loops.

    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        // Outer loop to pick each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count++] = currentChar;
            }
        }

        // Creates exact-size array
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    
    //Finds the frequency of characters using unique characters.
     
    public static String[][] findCharacterFrequency(String text) {

        // ASCII frequency array
        int[] frequency = new int[256];

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Finding frequency using unique characters
        String[][] frequencyResult = findCharacterFrequency(text);

        // Displaying result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(
                    frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]
            );
        }

        sc.close();
    }
}
