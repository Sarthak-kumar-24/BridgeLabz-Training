import java.util.Scanner;



//creating a class named PowerOfNumberUsingWhile

class PowerOfNumberUsingWhile{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number, power  as input
           int  number = sc.nextInt();
           int  power = sc.nextInt();


           int result =1;
             

             // checking if the number is positive and then calculating its power
           
            if( number > 0){
                          int counter =0;

                           while(counter < power){
                                      result  *= number
                                      counter++;

                                            
                            }
                           System.out.println(result);
                                  
           } else {
                          System.out.println( " Please enter a positive integer ");
            }
           
      
          sc.close();


    }
}