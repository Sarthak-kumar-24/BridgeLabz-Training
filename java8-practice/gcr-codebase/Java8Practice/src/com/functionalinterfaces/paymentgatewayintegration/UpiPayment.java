package com.functionalinterfaces.paymentgatewayintegration;

/*
 * UpiPayment
 * ----------
 * Existing payment provider.
 */
public class UpiPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println(" Paid Rs" + amount + " via UPI");
	}
}
