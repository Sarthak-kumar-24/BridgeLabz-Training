package com.constructor.levelone;

/**
 * Class Name: Product
 * Represents a product in an inventory system.
 * Demonstrates:
 * - Instance variables
 * - Static (class) variables
 * - Instance methods
 * - Static methods
 */
public class Product {

    // Instance variables
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    /**
     * Parameterized constructor
     * Initializes product details
     * Increments total product count
     */
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    /**
     * Instance method
     * Displays details of a single product
     */
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("----------------------------");
    }

    /**
     * Class (static) method
     * Displays total number of products created
     */
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    /**
     * Main method for testing
     */
    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Smartphone", 32000);
        Product p3 = new Product("Headphones", 2500);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}

