import java.util.Scanner;


/*
 created a class named LowercaseComparison that
 * 1) Takes complete text input using Scanner.nextLine()
 * 2) Converts the text to lowercase manually using ASCII logic and charAt()
 * 3) Converts the text to lowercase using built-in toLowerCase()
 * 4) Compares both results using a user-defined method

*/

public class  LowercaseComparison{


   //manually converting the text to uppercase
   public static void convertToLowercaseManually( String text){

       String result = "";
       for(int i=0;i< text.length(); i++){
             char ch = text.charAt(i);

            // If character is uppercase alphabet
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
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

        // Manual lowercase conversion
        String manualLowercase = convertToLowercaseManually(text);

        // Built-in lowercase conversion
        String builtInLowercase = text.toLowerCase();

        // Comparing both results
        boolean result = compareStringsUsingCharAt(manualLowercase, builtInLowercase);

        // Displaying results
        System.out.println("\Lowercase using manual method: " + manualLowercase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowercase);
        System.out.println("Are both results equal? " + result);

      sc.close();
   }
}

