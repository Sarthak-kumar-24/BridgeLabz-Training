package com.generics.dynamiconlinemarketplace;

/**
 * Product is a generic class where T represents
 * the category type of the product.
 *
 * Bounded Type Parameter:
 * T must extend Category
 */
public class Product<T extends Category> {
	
    private String name;
    private double price;
    private T category;

 
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Applies discount to the product
    void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    // Displays product details
    void display() {
        System.out.println(
            "Product: " + name +
            ", Category: " + category.getCategoryName() +
            ", Price: Rs" + price
        );
    }

}
