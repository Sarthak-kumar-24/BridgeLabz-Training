import java.util.Scanner;


// creating a class named MultiplicationFrom6To9  that takes the number as input
//  and performs multiplication from 6 to 9;

class  MultiplicationFrom6To9{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int number = sc.nextInt();
        // Array to store the  multiplication results from 6 to 9
        int[] multiplicationResult = new int[4];



       
      for(int i=6; i <= 9 ; i++){

                 multiplicationResult[i - 6] = number * i;
       }


       // Looping through the array to display the  table
       for(int i=6; i <= 9; i++){
                System.out.println(" number * " + i + " : " + multiplicationResult[i -  6] );
    
       } 

     sc.close();
    }
}