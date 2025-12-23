import java.util.Scanner;

/**
 * Created a class named  VowelConsonantCounter that
 * 1) Checks whether a character is a vowel, consonant, or not a letter  using ASCII-based logic.
 * 2) Counts the total number of vowels and consonants in a string  using the charAt() method.
 * 3) Displays the final count.
 */


public class VowelConsonantCounter{

  public static String checkVowelOrConsonant( char ch){

       if( ch>='A' && ch <= 'Z'){
           ch = (char)(ch + 32);
       }

       if( ch >= 'a' && ch <= 'z' ){

           if(ch =='a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u'){
               return "Vowel";
           }
          else{
              return "Consonant";
           } 
       }

       return "Not a Letter";
   }

    public static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        // Traverse string using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            String result = checkVowelOrConsonant(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Calling user-defined method
        int[] counts = findVowelsAndConsonants(text);

        // Displaying result
        System.out.println("\nVowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);

        sc.close();
   }
}

