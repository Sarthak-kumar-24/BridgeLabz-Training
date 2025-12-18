import java.util.Scanner;



//creating a class named MultiplesBelowHundred

class MultiplesBelowHundred{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number  as input
           int  number = sc.nextInt();
             

             // checkingfor all the multiples of that number below 100
           
            if( number > 0 && number < 100){

                                       for( int i=100; i>= 1; i--){

                                             if( i % number  == 0){
                                                     System.out.println(i);
                                                    
                                              }
                                       }
                                  
           } else {
                          System.out.println( " Please enter a positive integer and less then 100 ");
            }
           
      
          sc.close();


    }
}