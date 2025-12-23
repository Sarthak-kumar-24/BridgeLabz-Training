import java.util.Scanner;

/**
 * Created a class named  CharacterFrequencyNestedLoops that
 * finds the frequency of characters in a string
 * using nested loops and the toCharArray() method.
 * Duplicate characters are marked to avoid recounting.
 */
public class CharacterFrequencyNestedLoops {

    
     // Finds character frequencies using nested loops.

    public static String[] findCharacterFrequency(String text) {

        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Nested loop to count frequency
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] == '0') {
                continue; // already counted
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create result array
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Finding character frequency
        String[] frequencies = findCharacterFrequency(text);

        // Displaying result
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");

        for (String entry : frequencies) {
            System.out.println(entry);
        }

        sc.close();
    }
}
