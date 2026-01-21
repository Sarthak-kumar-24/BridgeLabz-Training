package com.ecommerceproductinventory;

public class Product {

	int sku;
	String name;
	double price;
	Product left, right;

	public Product(int sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.price = price;
		left = right = null;
	}

}
