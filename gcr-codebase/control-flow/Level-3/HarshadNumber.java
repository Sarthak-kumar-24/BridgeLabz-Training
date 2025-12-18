import java.util.Scanner;



//creating a class named HarshadNumber to check if the given number is harshad or not

class HarshadNumber{
      public static void main(String[]  args){
           Scanner sc = new Scanner( System.in );

          // taking the number  as input
           int  number = sc.nextInt();
           


           int sum =0;
           int originalNumber = number;



        //Creating a while loop to access each digit of the number.
        //Inside the loop, adding each digit of the number to sum.
          while(number != 0){
                 int digit = number % 10;
                 sum = sum + digit;             
                 number = number /10;
           }


           //Checking  if the number is perfectly divisible by the sum.
            if( originalNumber % sum ==0){
                         System.out.println(originalNumber + " is a Harshad Number");
             } else {
             System.out.println(originalNumber + " is not a Harshad Number");
              }



           sc.close();
 

    }
}