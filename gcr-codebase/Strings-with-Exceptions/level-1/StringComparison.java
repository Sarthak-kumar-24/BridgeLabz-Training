import java.util.Scanner;



/*

created a class named StringComparison that
compare two strings using the charAt() and .equals() and return the result

*/
public class StringComparison{

    public static boolean compareUsingCharAt( String first, String second){
       if(first.length() != second.length()){

           return false;
       }

       for( int i=0; i< first.length(); i++){

           if(first.charAt(i) != second.charAt(i)){
               return false;
           }
       }
       return true;
   }




   public static void main(String[] args){

       Scanner sc = new Scanner( System.in );

       //taking two strings as input
       String first = sc.next();
       String second = sc.next();



       boolean charAtResult = compareUsingCharAt( first, second);
       boolean equalsResult = first.equals(second);

        System.out.println("Using charAt() method: " + charAtResult);
        System.out.println("Using equals() method: " + equalsResult);

        // Checking if both approaches give the same result
        if (charAtResult == equalsResult) {
            System.out.println("Both methods produced the SAME result.");
        } else {
            System.out.println("Methods produced DIFFERENT results.");
        }

        sc.close();
   }
}
