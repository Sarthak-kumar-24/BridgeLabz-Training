import  java.util.Scanner;

//creating a class named SumUntillZero 


class SumUntillZero{
      public static void main(String[] args){
              Scanner sc = new Scanner(System.in);

              //creating variabes 
              double total =0.0;
              double value;

             // taking user initial  input
              value = sc.nextDouble();

             // Loop until user enters 0
             while( value != 0){
                   total += value;
                   value = sc.nextDouble();
             }
             
             // Display total
             System.out.println("The total sum is " + total);
            

        sc.close();
             

      }
}