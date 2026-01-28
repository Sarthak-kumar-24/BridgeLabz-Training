package com.functionalinterfaces.paymentgatewayintegration;

/*
 * PaymentApp
 * ----------
 * Demonstrates backward-compatible
 * refund integration.
 */
public class PaymentApp {

	public static void main(String[] args) {

		PaymentProcessor upi = new UpiPayment();
		PaymentProcessor card = new CreditCardPayment();

		upi.pay(500);
		upi.refund(200); // default refund

		System.out.println("-------------------");

		card.pay(1000);
		card.refund(400); // overridden refund
	}
}
