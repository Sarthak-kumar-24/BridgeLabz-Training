import java.util.Scanner;



//creating a class named FizzBuzz    using while loop

class FizzBuzzUsingWhile{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number as input
           int  number = sc.nextInt();



           if( number > 0){

                   int i=1;
                    while( i <= number ){
                            // checking if it is divisible by 3 and 5 both
                            if(int i %  3 == 0 && i % 5 == 0){
                                     System.out.println(" FizzBuzz");
                            } 
                    
                            // checking if it is divisible by 3
                            else if(int  i %  3 == 0){
                                    System.out.println(" Fizz");
                              }

                              // checking if it is divisible by 5
                              else  if( i % 5 == 0){

                                     System.out.println("Buzz ");

                              }else{

                                    System.out.println(i);
                             }
                           i++;
                   }


           } else {

                   System.out.println("Please enter a positive integer");
           }
           

      
          sc.close();


     }
}