import java.util.Scanner;



//creating a class named FactorialOfNumberUsingFor  to find factorial using for loop


class FactorialOfNumberUsingFor{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number n as input
           int n = sc.nextInt();


          // checking if it is positive 
           if (n>0){

               long factorial =1;
               

                // calcaulating its factorial
                while( int i=1;i<=n;i++){
                   factorial *= i;
                 

                System.out.println("The factorial of " + n + " is " + factorial);

          }    else {

                System.out.println("please enter a positive integer");


     }
     sc.close();


     }
}