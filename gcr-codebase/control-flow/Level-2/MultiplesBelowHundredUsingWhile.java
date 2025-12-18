import java.util.Scanner;



//creating a class named MultiplesBelowHundredUsingWhile

class MultiplesBelowHundredUsingWhile{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number  as input
           int  number = sc.nextInt();
             

             // checkingfor all the multiples of that number below 100 and then checking if the counter divides the number
           
            if( number > 0 && number < 100){
                                     
                                       int counter = number -1;

                                       while( counter > 1){

                                             if( number % counter  == 0){
                                                     System.out.println(counter);
                                                    
                                              }
                                       counter --;
                                       }
                                  
           } else {
                          System.out.println( " Please enter a positive integer and less then 100 ");
            }
           
      
          sc.close();


    }
}