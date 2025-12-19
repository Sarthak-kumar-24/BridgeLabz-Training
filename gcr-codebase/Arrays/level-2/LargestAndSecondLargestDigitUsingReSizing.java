import java.util.Scanner;

// created a class named LargestAndSecondLargestDigitUsingReSizing  to find the largest and second largest digits

class LargestAndSecondLargestDigitUsingReSizing{
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

                      //Increase array size if index reaches maxDigit
                      if(index == maxDigit){

                           // Increase maxDigit by 10
                           maxDigit = maxDigit +10;
                           int[] temp = new int[maxdigit];

                           // Copy old digits into temp array
                           for(int i=0;i <digits.length;i++){
                                  temp[i] = digits[i];
                           }
                           // Assign digits array to temp array
                           digits = temp;
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
