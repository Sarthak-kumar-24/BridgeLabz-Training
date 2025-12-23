import java.util.Scanner;


/*
 created a class named WordlengthAnalyzer that
1) Takes complete text input using Scanner.nextLine()
2) Splits the text into words using charAt() (without split())
3) Finds length of each word without using length()
4) Stores words and their lengths in a 2D String array
5) Displays the result in tabular format
*/

public class WordlengthAnalyzer{


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
 

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Manual split
        String[] manualWords = splitTextManually(text);

       
       
        String[][] words =createWordLengthTable(manualWords);

        for (int i = 0; i < words.length; i++) {
            String word = words[i][0];
            int length = Integer.parseInt(words[i][1]); // String → int

            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}