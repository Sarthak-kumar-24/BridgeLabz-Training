package com.functionalinterfaces.digitalpaymentinterface;

/*
 * PaymentProcessor
 * ----------------
 * Demonstrates interface-based
 * payment processing.
 */
public class PaymentProcessor {

	public static void main(String[] args) {

		// Interface references
		DigitalPayment upi = new UPI();
		DigitalPayment card = new CreditCard();
		DigitalPayment wallet = new Wallet();

		// Processing payments
		upi.pay(500.00);
		card.pay(1200.50);
		wallet.pay(300.75);
	}
}
