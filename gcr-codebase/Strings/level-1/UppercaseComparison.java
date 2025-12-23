import java.util.Scanner;


/*
 Created a class named UppercaseComparison that
 * 1) Takes complete text input using Scanner.nextLine()
 * 2) Converts the text to uppercase manually using ASCII logic and charAt()
 * 3) Converts the text to uppercase using built-in toUpperCase()
 * 4) Compares both results using a user-defined method
*/

public class  UppercaseComparison{


   //manually converting the text to uppercase
   public static void convertToUppercaseManually( String text){

       String result = "";
       for(int i=0;i< text.length(); i++){
             char ch = text.charAt(i);

            // If character is lowercase alphabet
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }

            result += ch;
       }
   }

    public static boolean compareStringsUsingCharAt(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

 

   public static void main( String[] args){


        Scanner sc = new Scanner(System.in);

        // Taking complete text input
        System.out.print("Enter the complete text: ");
        String text = sc.nextLine();

        // Manual uppercase conversion
        String manualUppercase = convertToUppercaseManually(text);

        // Built-in uppercase conversion
        String builtInUppercase = text.toUpperCase();

        // Comparing both results
        boolean result = compareStringsUsingCharAt(manualUppercase, builtInUppercase);

        // Displaying results
        System.out.println("\nUppercase using manual method: " + manualUppercase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("Are both results equal? " + result);

      sc.close();
   }
}

