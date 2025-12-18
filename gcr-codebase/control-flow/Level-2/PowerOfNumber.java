import java.util.Scanner;



//creating a class named PowerOfNumber

class PowerOfNumber{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number  as input
           int  number = sc.nextInt();
           int  power = sc.nextInt();


           int result =1;
             

             // checking if the number is positive and then calculating its power
           
            if( number > 0){

                                       for( int i = 1; i <= power;  i++){
                                               result  *= number

                                            
                                       }
                                      System.out.println(result);
                                  
           } else {
                          System.out.println( " Please enter a positive integer ");
            }
           
      
          sc.close();


    }
}