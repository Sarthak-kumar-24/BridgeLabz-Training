package com.collectors.orderrevenuesummary;

public class Order {

	String customer;
	double amount;

	// Constructor
	Order(String customer, double amount) {
		this.customer = customer;
		this.amount = amount;
	}

	// Getter for customer name
	public String getCustomer() {
		return customer;
	}

	// Getter for order amount
	public double getAmount() {
		return amount;
	}

}
