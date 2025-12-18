import java.util.Scanner;



//creating a class named GreatestFactorUsingWhile

class GreatestFactorUsingWhile{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number  as input
           int  number = sc.nextInt();
             

             // checking if it is positive and then looping to find greatest   number that is perfectly divides number
           
            if( number > 1){

                           int greatestFactor =1;
                            int counter = number -1;
                          while( counter >= 1){
                                       if( number % i   == 0){
                                                    greatestFactor = i;
                                                    break;
                                        }
                                       i--;
                                        

                           }
                           System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor );
           
           } else {
                          System.out.println( " Please enter a positive integer ");
            }
           
      
          sc.close();


    }
}