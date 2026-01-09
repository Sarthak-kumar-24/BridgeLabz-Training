package com.foodloop;
/*
 * FoodLoop – Restaurant Ordering System
 * 
 *  FoodLoop is an app where users place food orders from local restaurants.
 *  Requirements:
 * FoodItem class: name, category, price, availability.
 * Order class: contains list of food items and total.
 * Interface IOrderable with placeOrder() and cancelOrder().
 * Inheritance: VegItem, NonVegItem extend FoodItem.
 * Polymorphism: applyDiscount() varies by order total.
 */

import java.util.Scanner;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private int stock; 

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
    	return name;
    }

    public String getCategory() {
        return category;
    }
    

    public boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        stock--;
    }

    public abstract String getType();
    
    
 

    static String getDeliveryTime(int category) {
        switch (category) {
            case 1: return "20 Minutes";
            case 2: return "35 Minutes";
            case 3: return "25 Minutes";
            default: return "N/A";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        FoodItem[] menu = {
            new VegItem("Paneer Butter Masala", 250, 5),
            new VegItem("Veg Fried Rice", 180, 10),
            new NonVegItem("Chicken Biryani", 350, 6),
            new NonVegItem("Butter Chicken", 320, 4)
        };

        System.out.println("======================================");
        System.out.println("  Welcome to FoodLoop  ");
        System.out.println("======================================\n");

        System.out.println("---------------------- MENU -----------------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf(
                "%d. %-22s | %-7s | Rs%.2f | Available: %d%n",
                (i + 1),
                menu[i].getName(),
                menu[i].getType(),
                menu[i].getPrice(),
                menu[i].isAvailable() ? 1 : 0
            );
        }
        System.out.println("--------------------------------------------------");

        System.out.print("How many items do you want to order? ");
        int n = sc.nextInt();

        FoodItem[] selectedItems = new FoodItem[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Select "+(i+1)+"th item number: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > menu.length) {
                System.out.println("Invalid choice, try again");
                i--;
            } else {
                selectedItems[i] = menu[choice - 1];
            }
        }

        Order order = new Order(selectedItems);
        order.placeOrder();

        sc.close();
    }

}
