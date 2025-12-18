import java.util.Scanner;

//creating a class to check the if the largest number among three given numbers


class LargestAmong3{
     public static void main(String[] args){
           Scanner input= new Scanner(System.in);

          //taking user inputs
           int number1 = input.nextInt();
           int number2 = input.nextInt();
           int number3 = input.nextInt();







          // printing the final output whether the number is the largest or not
        System.out.println(
                "Is the first number the largest? " +
                        ((number1 > number2 && number1 > number3) ? "Yes" : "No") + "\n" +

                "Is the second number the largest? " +
                        ((number2 > number1 && number2 > number3) ? "Yes" : "No") + "\n" +

                "Is the third number the largest? " +
                        ((number3 > number1 && number3 > number2) ? "Yes" : "No")
        );
     }
}