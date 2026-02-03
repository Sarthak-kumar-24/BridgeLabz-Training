package com.functional.consumer;

import java.util.function.Consumer;

import com.functional.model.Product;

/*
 * OrderConfirmationConsumer
 * -----------------------------
 * Demonstrates use of Consumer functional interface.
 * Prints an order confirmation message for a product.
 */
public class OrderConfirmationConsumer {

	public static void main(String[] args) {

		Product p1 = new Product("Gaming Mouse", 1499);
		Product p2 = new Product("Keyboard", 2199);

		String customer1 = "Sarthak";
		String customer2 = "Seraphe";

		// Consumer: action = print confirmation
		Consumer<Product> confirmOrder = p -> System.out.println(" Order Confirmed | Customer: " + currentCustomer
				+ " | Product: " + p.getName() + " | Amount: Rs " + p.getPrice());

		// simple way to switch customer for demo
		currentCustomer = customer1;
		confirmOrder.accept(p1);

		currentCustomer = customer2;
		confirmOrder.accept(p2);
	}

	// demo helper field
	static String currentCustomer;

}
