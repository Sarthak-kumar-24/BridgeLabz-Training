import java.util.Scanner;



/*
created a class named MinMaxFinder and method named findSmallestAndLargest thatfinds the min and max values and stores in array
*/

public class MinMaxFinder{

 

   //method to calculate the sum
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        // Initializing smallest and largest with first number
        int smallest = number1;
        int largest = number1;

        // Compare second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return results as array
        return new int[] { smallest, largest };
    }



    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

        //getting he inputs
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Calling static method directly using class name
        int[] result = MinMaxFinder.findSmallestAndLargest(num1, num2, num3);

        // Displaying results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);    
      sc.close();
   }
}