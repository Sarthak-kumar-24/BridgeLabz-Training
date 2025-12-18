import java.util.Scanner;

//creating a class named CheckIfPosNegZero to check if the number is positive negative or zero

class CheckIfPosNegZero{
      public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

            //taking user age as input
             int number = sc.nextInt();



             // checking if it is positive , negative or zero
             if( number > 0 ){

                    System.out.println( "positive" );

            }  
             else if (number == 0){

                     System.out.println(" zero ");
            } else {

                    System.out.println(" negative");
             }

              sc.close();
       }
}