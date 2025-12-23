import java.util.Scanner;

/**
 Created a class named  StringIndexOutOfBoundsExceptionClass that
demonstrates StringIndexOutOfBoundsException in two ways:
 Generating the exception by accessing an invalid index using charAt()

 */

public class StringIndexOutOfBoundsExceptionClass{

   //generates the exception
   public static void generateException( String text){
       System.out.println(text.charAt(text.length()));
   }

   //handles the exception
   public static void handleException( String text ){

       try{
           System.out.println(text.charAt(text.length()));
       }catch(StringIndexOutOfBoundsException e){
           System.out.println("StringIndexOutOfBoundsException caught and handled.");
       }
   }




   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       String text = sc.next();
        try {
            generateException(text);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Exception occurred in generateException().");
        }

        //Handling  the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException...");
        handleException(text);

        sc.close();

   }
}