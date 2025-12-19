import java.util.Scanner;


// creating a class named OddEvenCheck  that takes the number as input
//  and checks whether it is even or odd if it is positive

class  OddEvenCheck{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Array to store the  5 numbers 
        int[] numbers = new int[5];


       System.out.println("Enter the 5 numbers");
       
      for(int i=0;i< numbers.length; i++){

             System.out.print("Enter the number " + (i + 1) + ": ");
             numbers[i] = sc.nextInt();
       }


       // Looping through the array to check the number 
       for(int i=0; i< numbers.length; i++){
             int num = numbers[i];
             
             if(num > 0){
                               if(num% 2 == 0){
                                    System.out.println("The number is even ");
                                } else {
                                    System.out.println(" The number is odd");
                                }
             }

             else if ( num < 0){
                  System.out.println(
                            "The number is Negative");
             }

             else { 
                   System.out.println(
                            "The number is zero");
            }

          if ( numbers[0] == numbers[4]) {
                System.out.println("Both the numbers are Equal");
          }
         else  if ( numbers[0] < numbers[4]) {
                System.out.println("First number is smaller then last");
          }

          else ( numbers[0] > numbers[4]) {
                System.out.println("First number is greater then last");
          }

             
       } 
     sc.close();
    }
}