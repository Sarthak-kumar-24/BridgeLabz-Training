import java.util.Scanner;

/**
 * Created a class named  CharacterTypeAnalyzer that
 * 1) Determines whether a character is a Vowel, Consonant, or Not a Letter  using ASCII-based logic.
 * 2) Processes a string using charAt() and stores results in a 2D array.
 * 3) Displays the result in a tabular format.
 */


public class CharacterTypeAnalyzer{

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

    public static int[][] findVowelsAndConsonants(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }

        return result;
    }

    public static void displayTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");

        for (int i = 0; i <  table.length;  i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        // Taking complete input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Analyze characters
        String[][] result = analyzeCharacters(text);

        // Display result
        displayTable(result);

        sc.close();  
   }
}

