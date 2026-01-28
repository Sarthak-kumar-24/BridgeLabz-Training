package com.functionalinterfaces.digitalpaymentinterface;

/*
 * CreditCard class
 * ----------------
 * Represents a credit card payment method.
 */
public class CreditCard implements DigitalPayment {

	@Override
	public void pay(double amount) {
		System.out.println(" Paid Rs" + amount + " using Credit Card");
	}
}
