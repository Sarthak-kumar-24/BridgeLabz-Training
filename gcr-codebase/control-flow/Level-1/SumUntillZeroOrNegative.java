import  java.util.Scanner;

//creating a class named SumUntillZeroOrNegative 


class SumUntillZeroOrNegative{
      public static void main(String[] args){
              Scanner sc = new Scanner(System.in);

              //creating variabes 
              double total = 0.0;
             

             
             // Loop until user enters 0 or negative value
             while( true){
                   double value = sc.nextDouble();

                   if(value <= 0){
                           break;
                  }
                  total += value;
             }
             
             // Display total
             System.out.println("The total sum is " + total);
            

        sc.close();
             

      }
}