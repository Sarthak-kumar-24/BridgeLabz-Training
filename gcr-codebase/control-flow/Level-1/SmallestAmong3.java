import java.util.Scanner;

//creating a class to check the if the first number is the smallest


class SmallestAmong3{
     public static void main(String[] args){
           Scanner input= new Scanner(System.in);

          //taking user inputs
           int number1 = input.nextInt();
           int number2 = input.nextInt();
           int number3 = input.nextInt();
          



          // printing the final output whether the 1st number is the smallest or not
       System.out.println(
                "Is the first number the smallest? " +
                ((number1 < number2 && number1 < number3) ? "Yes" : "No")
        );

        input.close();
     }
}