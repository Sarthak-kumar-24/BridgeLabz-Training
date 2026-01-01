package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

/* Online Food Delivery System
 * 
 * 
 * Define an abstract class FoodItem with fields like itemName, price, and quantity.
 * Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
 * Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
 * Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
 * Demonstrate encapsulation to restrict modifications to order details and 
 * use polymorphism to handle different types of food items in a single order-processing method.
 * 
 * 
 */
abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: Rs" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract behavior
    public abstract double calculateTotalPrice();
    
    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable d) {
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.println("Final Price: Rs" + finalPrice);
            System.out.println("----------------------------");
        }

        System.out.println("Grand Total: Rs" + grandTotal);
    }
    
    
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Pizza", 250, 2));
        order.add(new NonVegItem("Chicken Burger", 180, 1));

        processOrder(order);
    }
}

