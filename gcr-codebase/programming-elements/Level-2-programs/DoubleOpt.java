import java.util.Scanner;

//Creating a class named QuotientRemainder to compute the remainder and quotient of two numbers;


class DoubleOpt{
    public static void main(string[] args){
         Scanner sc = new Scanner(System.in);


         // taking inputs from user
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         double c=sc.nextDouble();


         //performing the required operations
          double operation1 = a + b *  c;
          double operation2= a * b + c;
          double operation3= c + a / b;
          double operation4= a % b + c;


         System.out.println(" The results of Double Operations are " +  operation1 + ","
                                                   + operation2+ "," + operation3+ "and" + operation4);
     }
}