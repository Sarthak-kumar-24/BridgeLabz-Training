package com.bookbazaar;

/*
 * Inheritance: EBook, PrintedBook extend Book.
 * 
 */
public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // ₹100 off if buying 2 or more
        return quantity >= 2 ? 100 : 0;
    }
}
