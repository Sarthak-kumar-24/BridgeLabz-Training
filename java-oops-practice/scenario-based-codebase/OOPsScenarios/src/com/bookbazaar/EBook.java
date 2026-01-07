package com.bookbazaar;

/*
 * Inheritance: EBook, PrintedBook extend Book.
 * 
 */
public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Flat 20% discount
        return price * quantity * 0.20;
    }
}
