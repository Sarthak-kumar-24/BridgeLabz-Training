//created a class named  ToggleCaseCharacters that Convert
//uppercase letters to lowercase and vice versa.

public class  ToggleCaseCharacters{

   public static String toggleCase(String text){

       StringBuilder result = new StringBuilder();

       for(int i=0;i< text.length(); i++){

           char ch = text.charAt(i);

           if(ch >= 'A' && ch <= 'Z'){
               result.append((char) (ch +32));
           }
           else if(ch >= 'a' && ch <= 'z'){
               result.append((char) (ch - 32));
           }

           else{
               result.append((ch ));
           }
       }
   return result.toString();

   }

    public static void main(String[] args) {

        String text = "JaVa 123";

        String toggledText = toggleCase(text);

        System.out.println("Original String : " + text);
        System.out.println("Toggled String  : " + toggledText);
    }
}

