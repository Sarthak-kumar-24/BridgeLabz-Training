package com.bookbazaar;

/*
 * Book class with fields: title, author, price, stock.
 * 
 */
public abstract class Book implements IDiscountable {
    private String title;
    private String author;
    protected double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Encapsulation: stock updatess only via method
    public boolean reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty;
            return true;
        }
        return false;
    }
}
