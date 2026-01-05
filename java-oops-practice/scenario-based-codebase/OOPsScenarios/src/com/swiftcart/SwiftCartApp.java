package com.swiftcart;

import java.util.*;

public class SwiftCartApp {

    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 80);

        Cart cart = new Cart();

        cart.addProduct(milk, 2);   // 50 * 2
        cart.addProduct(rice, 1);   // 80 * 1

        cart.applyDiscount();
        cart.generateBill();
    }
}

