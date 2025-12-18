import java.util.Scanner;

//creating a class to check the divisbilty by 5


class DivisiblityBy5{
     public static void main(String[] args){
           Scanner input= new Scanner(System.in);

          //taking user input
           int number = input.nextInt();


          // printing the final output whether is it Yes or No
            System.out.println(
                "Is the number " + number + " divisible by 5? " +
                ((number % 5 == 0) ? "Yes" : "No")
        );

        input.close();  
     }
}