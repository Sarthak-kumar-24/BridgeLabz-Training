package com.swiftcart;

import java.util.*;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Pre-filled cart
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product p, int quantity) {
        products.add(p);
        totalPrice += p.getPrice() * quantity; // operator used
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            discount += p.getDiscount(); // polymorphism
        }

        totalPrice -= discount; // operator
    }

    @Override
    public void generateBill() {
        System.out.println("\n SwiftCart Bill");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " Rs" + p.getPrice());
        }
        System.out.println("Total Payable: Rs" + totalPrice);
    }
}
