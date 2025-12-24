
 // Class Name: SubstringOccurrenceCounter that counts how many times a given substring occurs in a string.


public class SubstringOccurrenceCounter {


    public static int countOccurrences(String text,  String sub) {

        int count = 0;
        int textLength = text.length();
        int subLength = sub.length();

        // Loop till a point where substring comparison is possible
        for (int i = 0; i <= textLength - subLength; i++) {

            boolean matchFound = true;

            // Check character by character
            for (int j = 0; j < subLength; j++) {

                if (text.charAt(i + j) != sub.charAt(j)) {
                    matchFound = false;
                    break;
                }
            }

            if (matchFound) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "ababababa";
        String substring = "aba";

        int occurrences = countOccurrences(text, substring);

        System.out.println("Text           : " + text);
        System.out.println("Substring      : " + substring);
        System.out.println("Occurrences    : " + occurrences);
    }
}
