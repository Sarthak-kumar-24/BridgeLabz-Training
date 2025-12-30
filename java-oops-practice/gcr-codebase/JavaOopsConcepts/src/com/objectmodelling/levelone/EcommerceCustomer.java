package com.objectmodelling.levelone;

/*
 *  Design an e-commerce platform with Order, Customer, 
 *  and Product classes. Model relationships where a Customer places an Order, 
 *  and each Order contains multiple Product objects. 
 */
public class EcommerceCustomer {

    private String name;

    EcommerceCustomer(String name) {
        this.name = name;
    }

    // Association: customer places order
    void placeOrder(Order order) {
        System.out.println(name + " placed an order.");
        order.showOrderDetails();
    }
    public static void main(String[] args) {

    	EcommerceCustomer customer = new EcommerceCustomer("Aman");

        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 1200);

        Order order = new Order(101);

        // Aggregation
        order.addProduct(p1);
        order.addProduct(p2);

        // Association
        customer.placeOrder(order);
    }
}
