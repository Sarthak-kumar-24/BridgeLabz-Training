import java.util.Scanner;



//creating a class named GreatestFactor

class GreatestFactor{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number  as input
           int  number = sc.nextInt();
             

             // checking if it is positive and then looping to find greatest   number that is perfectly divides number
           
            if( number > 1){

                           int greatestFactor =1;
                          for(int i = number - 1; i >= 1;i--){
                                       if( number % i   == 0){
                                                    greatestFactor = i;
                                                    break;
                                        }
                                        

                           }
                           System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor );
           
           } else {
                          System.out.println( " Please enter a positive integer ");
            }
           
      
          sc.close();


    }
}