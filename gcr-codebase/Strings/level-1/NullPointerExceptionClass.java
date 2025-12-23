/*

Created a class named NullPointerExceptionClass that
Generates the exception by calling a String method on a null reference
Handling the exception using try-catch
*/

public class NullPointerExceptionClass{

   //genrates the exception
   public static void generateException() {

       String text = null;

       System.out.println(text.length());


   }

   //The exception is caught using try-catch block.
   public static void handleException(){

       String text = null;

       try{
           System.out.println(text.length());

       } catch( NullPointerException e) {
           System.out.println("NullPointerException caught and handled.");
       }

  }

   public static void main(String[] args){

       try{
           generateException();
       } catch(NullPointerException e){
           System.out.println("Exception occured");
       }

       handleException();

   }
}