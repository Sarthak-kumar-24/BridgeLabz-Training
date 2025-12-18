import java.util.Scanner;



//creating a class named FactorsOfNumber 

class FactorsOfNumber{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number  as input
           int  number = sc.nextInt();
             

             // checking if it is positive and then looping to find if  number is perfectly divisible by i
           
            if( number > 0){

                           System.out.println("Factors of " + number + " are: " );
                           for( int i=1; i< number; i++){
                                       if( number % i   == 0){
                                                    System.out.println(i);
                                        }

                           }
           
           } else {
                          System.out.println( " Please enter a positive integer ");
            }

           


                       
      
          sc.close();


     }
}