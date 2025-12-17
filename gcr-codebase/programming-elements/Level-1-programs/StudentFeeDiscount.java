import java.util.Scanner;

//creating  StudentFeeDiscount class to calculate discounted fee and final fee


public class StudentFeeDiscount {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


        // user input for fee amount, discount percentage
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();



        // Calculating discount amount and final fee after discount
        double discount = fee * ( discountPercent / 100);
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
