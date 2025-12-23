import java.util.Scanner;


/*
 created a class named SplitTextComparison that
finds the length of the String without using the built-in length() ,
 split the text into words using the charAt() method without using the String built-in split(), 
compare the two String arrays and return a boolean
*/

public class SplitTextComparison{


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
    
   public static void compareStrings( String[] text1, String[] text2 ){


       if( text1.length() != text2.length()){
           return false;
       }

       for(int i=0; i< text1.length();i++){

           if( !text1[i].equals(text2[i])){
               return false;
           }

       return true;

   }
 

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Manual split
        String[] manualWords = splitTextManually(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(manualWords, builtInWords);

        // Displaying output
        System.out.println("\nWords using manual method:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}