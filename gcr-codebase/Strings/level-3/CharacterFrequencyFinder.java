import java.util.Scanner;

/**
 * Clreated a class named CharacterFrequencyFinder that
  *finds the frequency of each character in a string
 * using the charAt() method and ASCII-based indexing.
 */
public class CharacterFrequencyFinder {

    
     //Finds character frequencies and returns them in a 2D array.

    public static String[][] findCharacterFrequencies(String text) {

        // ASCII frequency array
        int[] frequency = new int[256];

        //Count frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        //Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        //Store characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Finding character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Displaying result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
        }

        sc.close();
    }
}
