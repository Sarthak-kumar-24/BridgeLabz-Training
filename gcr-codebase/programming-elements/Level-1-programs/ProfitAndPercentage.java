// Created ProfitAndPercentage Class to compute the Profit and Percentage


public class ProfitAndPercentage {
    public static void main(String[]  args) {


        // Cost price and selling price in INR
        double costPrice = 129.0;
        double sellingPrice = 191.0;



        // profit and percentage calculation
        double profit = sellingPrice   - costPrice;
        double profitPercentage = (profit / costPrice) * 100;



        // Single print statement to display multi-line output
        System.out.println(
                "The Cost Price is INR " + costPrice  +
                " and Selling Price is INR " + sellingPrice + "\n" +
                "The Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
