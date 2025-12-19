import java.util.Scanner;


// creating a class named OddEvenArrayStorage  that takes the number as input
//  and store the values in diff arrays based on even or odd.

class  OddEvenArrayStorage{
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();


       //checking if it is natural number and then storing them on the basis of odd or even
       if( number > 0){

               int size = number / 2 + 1;

              // Array to store the  even and odd numbers 
               int[] evenNumbers = new int[size];
               int[] oddNumbers = new int[size];


               int oddIndex = 0;
               int evenIndex =0;

               for(int i=1; i<= number; i++){
                     if( i% 2 == 0){
                            evenNumbers[evenIndex] = i;
                            evenIndex++;
                     }
                     else{
                            oddNumbers[oddIndex] = i;
                            oddIndex++;
                    }

              }

              // Printing odd numbers
             System.out.println("Odd Numbers:");
             for (int i = 0; i < oddIndex; i++) {
                        System.out.print(oddNumbers[i] + " ");
              }

             // Printing even numbers
             System.out.println("Even Numbers:");
             for (int i = 0; i < evenIndex; i++) {
                     System.out.print(evenNumbers[i] + " ");
              }

        } else {
                // giving error and clsoing if it gives non natutal number
               System.out.println("Error: ");
               sc.close();
               return;
        }
     
     sc.close();
    }
}