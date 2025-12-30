package com.objectmodelling.levelone;

/*
 *  Design an e-commerce platform with Order, Customer, 
 *  and Product classes. Model relationships where a Customer places an Order, 
 *  and each Order contains multiple Product objects. 
 */
public class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
