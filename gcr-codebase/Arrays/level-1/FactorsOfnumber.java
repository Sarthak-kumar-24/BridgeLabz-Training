import java.util.Scanner;


// creating a class named FactorsOfNumber  that stores factors of a number

class  FactorsOfNumber{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();


       //checking if it is natural number and then finding iuts factor
       if( number > 0){

               int maxFactor = 10;

              // Array to store factors 
               int[] factors = new int[maxFactor];
               
               int index = 0;
           

               for(int i=1; i<= number; i++){

                     if( number%  i == 0){

                           // If array is full, resize it
                           if(index == maxFactor){
                                    
                                    // Double the size
                                     maxFactor = maxFactor * 2;

                                     // Temporary array with increased size
                                     int[] temp = new int[maxFactor];

                                    // Copy old elements to new array
                                    for (int j = 0; j < index; j++) {
                                               temp[j] = factors[j];
                                      }

                                   // Assign temp array back to factors
                                  factors = temp;
      
                           }    
                    // Store factor in array               
                     factors[index] = i;
                     index++;
   
                    }

              }


            // Display factors
              System.out.println("Factors of " + number + " are:");
              for (int i = 0; i < index; i++) {
                         System.out.print(factors[i] + " ");
              }
     
     sc.close();
    }
}