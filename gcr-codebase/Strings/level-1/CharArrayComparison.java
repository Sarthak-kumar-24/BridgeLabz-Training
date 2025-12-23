import java.util.Scanner;


/*
created a class named CharArrayComparison that
return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method
and display the result
*/

public class CharArrayComparison{


   public static char[]  getCharactersManually(  String text){

       char[] character = new char[text.length()];

       for(int i=0; i< text.length(); i++){
           character[i] = text.charAt(i);
       }

       return character;
   }

   public static boolean compareCharArrays( char[] first, char[] second){

       if(first.length != second.length){

           return false;
       }
       // Compare each character
       for (int i = 0; i < first.length; i++) {

            if (first[i] != second[i]) {
                return false;
            }

        }
       return true;
   }


   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       //tking user input
       String text = sc.next();

       char[] manualArray = getCharactersManually(text);

       char[] builtInArray = text.toCharArray( );


       boolean result = compareCharArrays(manualArray,  builtInArray);

       System.out.println("\n\nAre both character arrays equal? " + result);

       sc.close();
   }
}
