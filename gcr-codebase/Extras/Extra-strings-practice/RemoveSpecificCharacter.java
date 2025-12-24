/**
 * Class Name: RemoveSpecificCharacter 
 * Removes all occurrences of a specific character from a string.
 */

public class RemoveSpecificCharacter{

   pubic static String removeCharacter( String text, char removechar){

       StringBuilder result = new StringBuilder();

       for(int i=0;i< text.length(); i++){
           char ch = text.charAt(i);

           if( ch != removeChar){
               result.append(ch);
           }
       } 
       return result.toString();
   }

    public static void main(String[] args) {

        String text = "Hello World";
        char charToRemove = 'l';

        String modifiedString = removeCharacter(text, charToRemove);

        System.out.println("Original String : " + text);
        System.out.println("Character Removed : '" + charToRemove + "'");
        System.out.println("Modified String : " + modifiedString);
    }
}

