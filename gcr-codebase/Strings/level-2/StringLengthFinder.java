import java.util.Scanner;


/*
 created a class named StringLengthFinder that
that find string's length without using the built-in length()

*/

public class  StringLengthFinder{


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


 

   public static void main( String[] args){


        Scanner sc = new Scanner(System.in);

        // Taking user input using next()
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined length calculation
        int manualLength = findLengthWithoutLengthMethod(text);

        // Built-in length() method
        int builtInLength = text.length();

        // Displaying results
        System.out.println("Length using user-defined method: " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
   }
}

