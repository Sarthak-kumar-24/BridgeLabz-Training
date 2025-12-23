import java.util.Scanner;


/*
 created a class named ShortestAndLongestWordFinder that
 * 1) Takes complete text input using Scanner.nextLine()
 * 2) Splits the text into words using charAt() (without split())
 * 3) Finds string length without using length()
 * 4) Stores words and their lengths in a 2D String array
 * 5) Finds the shortest and longest words
 * 6) Displays the result
*/

public class ShortestAndLongestWordFinder{


   //manually finding the string length
    public static int findLengthWithoutLengthMethod(String text) {

        int count = 0;

        try {
            while (true) { // infinite loop
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

            // Exception occurs when index exceeds string length
            return count;
        }
    }


   //splits the text words manually and then stores in 1D array
    public static String[] splitTextManually(String text) {
           
       
        int length = findLengthWithoutLengthMethod(text);

        // Step 1: Count words
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store start indexes of words
        int[] startIndexes = new int[wordCount];
        startIndexes[0] = 0;

        int index = 1;
        for ( int i = 0; i < length; i++ ) {
            if (text.charAt(i) == ' ') {
                startIndexes[index++] = i + 1;
            }
        }

        // Step 3: Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            int start = startIndexes[i];
            int end = (i == wordCount - 1) ? length : startIndexes[i + 1] - 1;

            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }
    

   //adds  the length of each word in 2D array
   public static String[][]  createWordLengthTable( String[] text ){


       String[][] words= new String[text.length][2];

       for(int i=0; i< text.length; i++){

           words[i][0] = text[i];
           words[i][1] = String.valueOf( findLengthWithoutLengthMethod( text[i] )   );
       }
      return words;



   }

   //finding the smallest and longest word
   public static int[] findShortestAndLongest( String[][]  words){

       int shortestIndex =0;
       int longestIndex =0;

       int shortestLength = Integer.parseInt(words[0][1]);
       int longestLength = Integer.parseInt(words[0][1]);

        for (int i = 1; i < words.length; i++) {
            int currentLength = Integer.parseInt(words[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
   }
 

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Manual split
        String[] manualWords = splitTextManually(text);

       
       
        String[][] wordsTable =createWordLengthTable(manualWords);

       int[] resultIndexes = findShortestAndLongest(wordsTable);

        int shortestIndex = resultIndexes[0];
        int longestIndex = resultIndexes[1];

        // Displaying results
        System.out.println("\nShortest Word: " + wordsTable[shortestIndex][0]
                + " (Length: " + wordsTable[shortestIndex][1] + ")");

        System.out.println("Longest Word: " + wordsTable[longestIndex][0]
                + " (Length: " + wordsTable[longestIndex][1] + ")");

     

        sc.close();
    }
}