import java.util.Scanner;



//creating a class named FactorialOfNumber  to find factorial


class FactorialOfNumber{
      public static void main(String[] args){
           Scanner sc = new Scanner(System.in);

          // taking the number n as input
           int n = sc.nextInt();


          // checking if it is positive 
           if (n>0){

               long factorial =1;
               int i=1;

                // calcaulating its factorial
                while( i <= n  ){
                   factorial *= I;
                   i++;

                System.out.println("The factorial of " + n + " is " + factorial);

          }    else {

                System.out.println("please enter a positive integer");


     }
     sc.close();


     }
}