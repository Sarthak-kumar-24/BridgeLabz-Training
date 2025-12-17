// Creating class named DiscountedAmount to compute the discount amount and final fee


public class DiscountedAmount {
    public static void main(String[] args) {


        // the fee amount and the applied discount
        int fee  = 125000;
        int discountPercent = 10;


        // Calculating  the discount 
        float discount =  fee  *  ( discountPercent / 100 );
        // Calculating  remaining final fee
        int finalFee = fee -  discount;


        // Single print statement to display output
        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );
    }
}
