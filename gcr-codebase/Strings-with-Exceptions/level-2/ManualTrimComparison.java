import java.util.Scanner;

/**
 * Created a class named  ManualTrimComparison that
 * 1) Trims leading and trailing spaces manually using charAt()
 * 2) Extracts substring using charAt()
 * 3) Compares the manual result with String.trim()
 * 4) Displays the result
 */


public class ManualTrimComparison{

  public static int[] findTrimIndexes(String text) {

       int start = 0;
       int end = text.length() - 1;
       

       while (start <= end && text.charAt(start) == ' ') {
           start++;
       }

       while (end >= start && text.charAt(end) == ' ') {
          end--;
       }

       return new int[]{start, end + 1};
   }

    //Compares two strings using charAt().
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
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

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Taking complete input including spaces
        System.out.print("Enter the text with  spaces: ");
        String text = sc.nextLine();

        // trim indexes manually
        int[] indexes = findTrimIndexes(text);
s
        //Create trimmed string manually
        String manualTrimmed =
                createSubstringUsingCharAt(text, indexes[0], indexes[1]);

        // using built-in trim()
        String builtInTrimmed = text.trim();

        //Comparing results
        boolean isSame =
                compareStringsUsingCharAt(manualTrimmed, builtInTrimmed);

        // Displaying output
        System.out.println("\nManual Trim Result: [" + manualTrimmed + "]");
        System.out.println("Built-in trim() Result: [" + builtInTrimmed + "]");
        System.out.println("Are both results equal? " + isSame);

        sc.close();   
   }
}

