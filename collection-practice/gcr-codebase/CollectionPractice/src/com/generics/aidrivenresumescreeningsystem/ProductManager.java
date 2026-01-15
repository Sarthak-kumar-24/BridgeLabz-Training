package com.generics.aidrivenresumescreeningsystem;

public class ProductManager extends JobRole {

	ProductManager() {
		super("Product Manager");
	}

	@Override
	void screenResume() {
		System.out.println(roleName + ": Checking Product Sense, Strategy, Communication");
	}

}
