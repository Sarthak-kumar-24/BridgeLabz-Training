import java.util.Scanner;

//Creating a class named QuotientRemainder to compute the remainder and quotient of two numbers;


class IntOperation{
    public static void main(string[] args){
         Scanner sc = new Scanner(System.in);


         // taking inputs from user
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();


         //performing the required operations
          int operation1 = a + b *  c;
          int operation2= a * b + c;
          int operation3= c + a / b;
          int operation4= a % b + c;


         System.out.println(" The results of Int Operations are " +  operation1 + ","
                                                   + operation2+ "," + operation3+ "and" + operation4);
     }
}