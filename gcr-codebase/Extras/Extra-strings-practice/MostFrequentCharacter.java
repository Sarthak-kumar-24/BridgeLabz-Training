/**
 * Class Name: MostFrequentCharacter
 * Finds the most frequent character in a given string.
 */

public class MostFrequentCharacter{

   public static char findMostFrequentCharacter(String text){

       int[] frequency = new int[256];

       for( int i=0; i< text.length(); i++){
           frequency[text.charAt(i)]++;
       }

       int maxCount = 0;
       char mostFrequent = '\0';

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {

        String text = "success";

        char result = findMostFrequentCharacter(text);

        System.out.println("String                 : " + text);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}

