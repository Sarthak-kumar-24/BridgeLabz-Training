import java.util.Scanner;


/*
 created a class named NumberFormatExceptionClass that
demonstrates NumberFormatException using String Integer.parseInt(). and shows 
Trying to convert a non-numeric String into an integer using Integer.parseInt()
Handling the exception using try-catch
 */
public class  NumberFormatExceptionClass{


   //generating the exception
   public static void generateException( String text){

       System.out.println( Integer.parseInt(text));

   }

   //handling the exception
   public static void  handleException(String text){
        try {
            
            System.out.println(Integer.parseInt(text));

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException caught and handled.");
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
       } catch (NumberFormatException e){

       System.out.println( "Exception occurred in generateException().");
       }


       handleException(text);
       sc.close();

   }
}

