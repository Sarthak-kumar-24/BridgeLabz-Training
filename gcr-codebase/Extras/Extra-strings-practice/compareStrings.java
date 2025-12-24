//created aclass named LexicographicalStringComparison that compare two strings lexicographically

public class LexicographicalStringComparison {


   public static void compareStrings(String first, String second){

       int minLength = Math.min(first.length(),  second.length());

       int result =0;

       for(int i=0;  i < minLength;  i++){

           char ch1 = first.charAt(i);
           char ch2 = second.charAt(i);

           if(ch1 != ch2){

               result = ch1 - ch2;
               break;
           }
       }

       if(result == 0){

           result = first.length() - second.length();
       }
        // Display result
        if (result < 0) {
            System.out.println("\"" + first + "\" comes before \"" + second + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + first + "\" comes after \"" + second + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";

        compareStrings(str1, str2);
    }
}




