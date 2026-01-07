package com.bookbazaar;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

/* BookBazaar – Digital Bookstore System
 * You’re building the backend for BookBazaar, an online bookstore.
 * It must handle book inventory, orders, and discounts.
 * 
 * Order class that links a user to one or more books.
 */
public class Order {
	
	
    private String customerName;
    private Map<Book, Integer> items = new LinkedHashMap<>();
    private boolean orderConfirmed; 

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println(" Not enough stock for " + book.getTitle());
        }
    }

    protected void confirmOrder() {
        orderConfirmed = true;
    }

    public boolean isConfirmed() {
        return orderConfirmed;
    }

    public void printInvoice() {
        DecimalFormat df = new DecimalFormat("0.00");
        double grandTotal = 0;

        printHeader(customerName);

        for (Book book : items.keySet()) {
            int qty = items.get(book);
            double total = book.getPrice() * qty;
            double discount = book.applyDiscount(qty);
            double finalAmount = total - discount;

            grandTotal += finalAmount;

            System.out.println(" Book Title     : " + book.getTitle());
            System.out.println(" Author         : " + book.getAuthor());
            System.out.println(" Quantity       : " + qty);
            System.out.println(" Price/unit     : Rs" + book.getPrice());
            System.out.println(" Discount       : Rs" + df.format(discount));
            System.out.println(" Subtotal       : Rs" + df.format(finalAmount));
            System.out.println("--------------------------------------------------");
        }

        confirmOrder();

        System.out.println(" Order Status   : CONFIRMED");
        System.out.println(" Grand Total    : Rs" + df.format(grandTotal));
        printFooter();
    }

    private void printHeader(String name) {
        System.out.println("\n==================================================");
        System.out.println("               BookBazaar ");
        System.out.println("          Digital Bookstore Invoice");
        System.out.println("==================================================");
        System.out.println(" Customer Name : " + name);
        System.out.println("--------------------------------------------------");
    }

    private void printFooter() {
        System.out.println("==================================================");
        System.out.println("Thank you for shopping with BookBazaar ");
        System.out.println("Read more. Spend less. Stay curious.");
        System.out.println("==================================================");
    }
    
    public static void main(String[] args) {

        Book ebook = new EBook("Atomic Habits","James Clear",500,50);

        Book printedBook = new PrintedBook("Clean Code","Robert C. Martin",700, 20);

        Order order = new Order("Aman Verma");

        order.addBook(ebook, 2);
        order.addBook(printedBook, 2);

        order.printInvoice();
    }

}
