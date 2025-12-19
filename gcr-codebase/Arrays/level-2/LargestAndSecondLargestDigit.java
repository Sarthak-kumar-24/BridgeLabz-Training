import java.util.Scanner;

// created a class named LargestAndSecondLargestDigit  to find the largest and second largest digits

class LargestAndSecondLargestDigit{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                
                //storing the input
                int number = sc.nextInt();

                if(number < 0){
                      number = Math.abs(number);
                }

                // storing max  allowed digit size
                int maxDigit=10;
                int[] digits = new int[maxDigit];

                int index =0;
               //Extract digits until number becomes 0
                while(number !=0  ){

                      //Stop if max size reached
                      if(index == maxDigit){
                           break;
                      }
                      // Remove last digit and store it
                      digits[index] = number % 10;
                      index++;

                      number = number /10;
                 }
                 int largest =-1;
                 int secondLargest =-1;
                //Loop to find largest and second largest
                 for(int i=0; i< index; i++){

                        int currentDigit = digits[i];
                        if(currentDigit > largest){
                                   secondLargest = largest;
                                   largest = currentDigit;
                        }
                         else if (currentDigit > secondLargest && currentDigit < largest){
                                 secondLargest = currentDigit;
                        }
                  }

                 // Displaying  result
                System.out.println("Largest digit: " + largest);
                 System.out.println("Second largest digit: " + secondLargest);


                  sc.close();



         }
}
