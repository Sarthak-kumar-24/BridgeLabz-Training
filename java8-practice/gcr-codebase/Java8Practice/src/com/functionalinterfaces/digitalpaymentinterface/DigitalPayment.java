package com.functionalinterfaces.digitalpaymentinterface;

/*
 * DigitalPayment Interface
 * ------------------------
 * Defines a common payment operation
 * for all digital payment methods.
 */
public interface DigitalPayment {

	/**
	 * Performs the payment operation
	 */
	void pay(double amount);
}
