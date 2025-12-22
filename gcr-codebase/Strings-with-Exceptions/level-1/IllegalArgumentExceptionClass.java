import java.util.Scanner;


/*
 created a class named IllegalArgumentExceptionClass that
demonstrates IllegalArgumentException using String substring(). and shows 
How the exception is generated
How the exception is handled using try-catch
 */
public class  IllegalArgumentExceptionClass{


   //generating the exception
   public static void generateException( String text){

       System.out.println( text.substring(5,2));

   }

   //handling the exception
   public static void  handleException(String text){
        try {
            // Invalid substring range
            System.out.println(text.substring(5, 2));

        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException caught and handled.");
        } catch (RuntimeException e) {

            System.out.println(" generic RuntimeException caught.");
        }
   }

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       //getting user input
       String text = sc.next();

       try{

          generateException( text );
       } catch (IllegalArgumentException e){

       System.out.println( "Exception occurred in generateException().");
       }


       handleException(text);
       sc.close();

   }
}

