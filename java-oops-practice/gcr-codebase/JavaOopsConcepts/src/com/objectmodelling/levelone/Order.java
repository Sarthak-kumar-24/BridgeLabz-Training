package com.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;

/*
 *  Design an e-commerce platform with Order, Customer, 
 *  and Product classes. Model relationships where a Customer places an Order, 
 *  and each Order contains multiple Product objects. 
 */
public class Order {

	private int orderId;
	private List<Product> products = new ArrayList<>();

	Order(int orderId) {
		this.orderId = orderId;
	}

	// Aggregation: product passed from outside
	void addProduct(Product product) {
		products.add(product);
	}

	void showOrderDetails() {
		System.out.println("Order ID: " + orderId);
		double total = 0;

		for (Product p : products) {
			System.out.println(p.getName() + " -  Rs" + p.getPrice());
			total += p.getPrice();
		}

		System.out.println("Total: Rs" + total);
	}
}
