import java.util.Scanner;

//creating  StudentFeeDiscount class to calculate discounted fee and final fee


public class StudentFeeDiscount {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        // user input for fee amount
        double fee = input.nextDouble();

        //user input for discount percentage
        double discountPercent = input.nextDouble();

        // Calculating discount amount
        double discount = fee * ( discountPercent / 100);

        // Calculating final fee after discount
        double finalFee = fee - discount;

        // Single print statement to display output
        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );

        // Close scanner resource
        input.close();
    }
}
