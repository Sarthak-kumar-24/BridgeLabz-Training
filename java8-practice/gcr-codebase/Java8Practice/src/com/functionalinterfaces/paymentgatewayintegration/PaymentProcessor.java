package com.functionalinterfaces.paymentgatewayintegration;

/*
 * PaymentProcessor Interface
 * --------------------------
 * Defines common payment operations
 * for multiple payment gateways.
 */
public interface PaymentProcessor {

	/**
	 * Process a payment.
	 */
	void pay(double amount);

	/**
	 * Default acontecendo refund implementation. Existing payment providers are NOT
	 * forced to override this method.
	 */
	default void refund(double amount) {
		System.out.println(" Refund of Rs" + amount + " initiated (default processing)");
	}
}
