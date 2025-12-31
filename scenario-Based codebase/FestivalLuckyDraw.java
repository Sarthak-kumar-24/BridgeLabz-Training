import java.util.Scanner;

/*
20. Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
 If the number is divisible by 3 and 5, they win a gift.
 Use if, modulus, and loop for multiple visitors.
 continue if input is invalid.
*/

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("\nVisitor " + i + ", enter your number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println(" Invalid number! Skipping this visitor.");
                continue;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(" Congrats! You won a Diwali gift!");
            } else {
                System.out.println(" Better luck next time!");
            }
        }

        sc.close();
    }
}
