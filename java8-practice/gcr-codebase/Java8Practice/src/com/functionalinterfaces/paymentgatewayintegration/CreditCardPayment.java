package com.functionalinterfaces.paymentgatewayintegration;

/*
 * CreditCardPayment
 * -----------------
 * Payment provider with custom refund logic.
 */
public class CreditCardPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println(" Paid Rs" + amount + " via Credit Card");
	}

	@Override
	public void refund(double amount) {
		System.out.println(" Refund of Rs" + amount + " processed to Credit Card");
	}
}
