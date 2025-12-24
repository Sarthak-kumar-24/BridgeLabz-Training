//ctreated a class named PalindromeStringCheck that checks the palindrome


public class PalindromeStringCheck{

   public static boolean isPalindrome(String text){

       int start =0;
       int end = text.length() -1;

       while(start < end){

           if( text.charAt( start )   !=   text.charAt(end)  ){
               return false;
           }
       start++;
       end--;
       }
    return true;
   }

    public static void main(String[] args) {

        String text = "madam";

        if (isPalindrome(text)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
