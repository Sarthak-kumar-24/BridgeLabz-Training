import java.util.Scanner;



//creating a class named PrimeNumber to check wheter the number is prime 

class PrimeNumber{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number  as input
           int  number = sc.nextInt();



            Boolean isPrime = true;


          //checking if the number is negative or 1
           if( number <= 1){
                isPrime = false;
            }
           else{

                  //finding if it is prime 
                  for(int i=2; i >number;i++){

                         if(number % i ==0){
                                isPrime = false;
                                break;
                          }
                   }
            }


              if(isprime){
                         System.out.println(number + " is a prime Number");
               }
               else{
                         System.out.println(number + "mis not a prime Number");
                }


      
             sc.close();


    }
}