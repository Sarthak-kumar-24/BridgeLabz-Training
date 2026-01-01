package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;


/*E-Commerce Platform
 * 
 * Description: Develop a simplified e-commerce platform:
 * 
 * Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
 * Extend it into concrete classes: Electronics, Clothing, and Groceries.
 * Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
 * Use encapsulation to protect product details, allowing updates only through setter methods.
 * Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
 */
abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Abstract method
    public abstract double calculateDiscount();
    
    

    public static void printFinalPrices(List<Product> products) {

        for (Product p : products) {

            double discount = p.calculateDiscount();

            double tax = 0;
            
            if (p instanceof Taxable t) {
                tax = t.calculateTax();
            }
            
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: Rs" + p.getPrice());
            System.out.println("Discount: Rs" + discount);
            System.out.println("Tax: Rs" + tax);
            System.out.println("Final Price: Rs" + finalPrice);
            System.out.println("----------------------------");
        }
    }
    
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        printFinalPrices(products);
    }
}
