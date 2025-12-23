import java.util.Scanner;


/*
 created a class named ArrayIndexOutOfBoundsExceptionClass that
demonstrates ArrayIndexOutOfBoundsException using String arr[arr.length]. and shows 
Accessing an array index greater than its length

*/

public class  ArrayIndexOutOfBoundsExceptionClass{


   //generating the exception
   public static void generateException( String[] names){

       System.out.println( names[names.length]);

   }

   //handling the exception
   public static void  handleException(int[] names){
        try {
            
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
        } catch (RuntimeException e) {

            System.out.println(" generic RuntimeException caught.");
        }
   }

   public static void main( String[] args){

       Scanner sc = new Scanner(System.in);

       //getting user input
       int size = sc.nextInt();
       String[] names = sc.nextln[size];


       for(int i=0;i < size;i++){
           names[i] = sc.nextInt();
       }

       try{

          generateException( names );
       } catch (ArrayIndexOutOfBoundsException e){

       System.out.println( "Exception occurred in generateException().");
       }


       handleException( names );
       sc.close();

   }
}

