package com.functionalinterfaces.digitalpaymentinterface;

/*
 * UPI class
 * ---------
 * Represents a UPI-based payment method.
 */
public class UPI implements DigitalPayment {

	@Override
	public void pay(double amount) {
		System.out.println(" Paid Rs" + amount + " using UPI");
	}
}