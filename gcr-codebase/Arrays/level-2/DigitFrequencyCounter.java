import java.util.Scanner;

//created a class named DigitFrequencyCounter that calculates the frequency of digits


class DigitFrequencyCounter{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        //Take input for number 
        System.out.print("Enter  number: ");
        int  number  = sc.nextInt();

        if (number < 0) {
           number = Math.abs(number);
            
        }

         //Find the count of digits
        int temp = number;
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }
        }

      //Store digits in an array
      int[] digits = new int[digitCount];
        int index = 0;

        if (number == 0) {
            digits[0] = 0;
        } else {
            while (number != 0) {
                digits[index] = number % 10;
                index++;
                number = number / 10;
            }
        }

        //Frequency array of size 10 (0–9)
        int[] frequency = new int[10];

        // Calculating frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        //Displaying the frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
       sc.close();

   }
}



