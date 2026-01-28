package com.functionalinterfaces.digitalpaymentinterface;

/*
 * Wallet class
 * ------------
 * Represents a digital wallet payment method.
 */
public class Wallet implements DigitalPayment {

	@Override
	public void pay(double amount) {
		System.out.println(" Paid Rs" + amount + " using Wallet");
	}
}
