//ctreated a class named ReverseString that reverses the string


public class ReverseString{

   public static StringreverseString(String text){

       StringBuilder reversed = new StringBuilder();

       for(int i= text.length() -1; i >= 0;i--){

           reversed.append(text.charAt(i));
       }
       return reversed.toString();
   }

    public static void main(String[] args) {

        String text = "Sarthak Singh Rathore";

        String reversedText = reverseString(text);

        System.out.println("Original String : " + text);
        System.out.println("Reversed String : " + reversedText);
    }
}