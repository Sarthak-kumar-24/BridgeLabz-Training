import java.util.Scanner;


// creating a class named MultiplicationTable  that takes the number as input
//  and store the results of multiplication from 1 to 10


class  MultiplicationTable{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int number = sc.nextInt();
        // Array to store the  multiplication result upto 10 numbers 
        int[] results = new int[10];


      
      // performing multipication  and storing in array
      for(int i=1; i <= number ; i++){

                 results[i - 1] = number * i;
       }


       // Looping through the array to print multiplication table
       for(int i=1; i <= 10; i++){

            System.out.println(" number * "+ i + " = " + results[i-1] );             
           
             
       } 
     sc.close();
    }
}