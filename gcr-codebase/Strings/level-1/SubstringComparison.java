import java.util.Scanner;



/*
Created a class named SubstringComparison that
create a substring from a String using the charAt() method
substring() to find the substring of the text.
*/
public class SubstringComparison{

    public static String createSubstringUsingCharAt( String text, int start, int end){
       String result = "";



       for( int i= start; i< end; i++){
             result += text.charAt(i);

       }
       return result;
   }


    public static String comparingUsingCharAt( String first, String second){
       
       if(first.length() != second.length()){

           return false;
       }


       for(int i = 0; i < first.length(); i++){
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }

       }
       return true;
   }



   public static void main(String[] args){

       Scanner sc = new Scanner( System.in );


        // Taking string input
        System.out.print("Enter the text: ");
        String text = sc.next();

       //taking two strings as input
       String start = sc.next();
       String end= sc.next();


       if( start < 0 || start > end){ 
            System.out.println("Invalid start or end index.");
            sc.close();
            return;
       }


        // Substring using charAt()
        String manualSubstring = createSubstringUsingCharAt(text, start, end);

        // Substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // Compare both substrings
        boolean comparisonResult =
                compareStringsUsingCharAt(manualSubstring, builtInSubstring);

       // Display results
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + comparisonResult);

        sc.close();
   }
}
