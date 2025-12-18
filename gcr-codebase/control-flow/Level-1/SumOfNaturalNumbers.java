import java.util.Scanner;



//creating a class named SumOfNaturalNumbers to check if the given number is natural and its sum


class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        // Taking user input
        int number = input.nextInt();


        // Checking if number is a natural number
        if(number > 0){
           int sum = number *(number +1)/2;

            System.out.println(
                   "The sum of " + number + " natural numbers is " + sum
            );
            
        } else {
            // if the given number is not a natural number

             System.out.println(
                     "The number "+ number + " is not a natural number"
            );
        }

        input.close();
    }
}
