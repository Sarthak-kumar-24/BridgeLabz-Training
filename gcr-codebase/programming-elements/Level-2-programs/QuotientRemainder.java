import java.util.Scanner;

//Creating a class named QuotientRemainder to compute the remainder and quotient of two numbers;
class QuotientRemainder{
    public static void main(string[] args){
         Scanner sc = new Scanner(System.in);

         int number1=sc.nextInt();
         int number2=sc.nextInt();

          int quotient = number1 / number2;
          int remainder= number % number2;


         System.out.println(" The Quotient is " + quotient  +" and Remainder is " 
                                                 + remainder + " of two number " +         number1 
                                                  + " and " + number2 );
     }
}