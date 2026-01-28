package com.functionalinterfaces.sensitivedatatagging;

/*
 * SecurityApp
 * -----------
 * Demonstrates sensitive data tagging
 * using a custom marker interface.
 */
public class SecurityApp {

	public static void main(String[] args) {

		CustomerAccount account = new CustomerAccount("ACC12345", "secret@123");

		ProductInfo product = new ProductInfo("Laptop");

		EncryptionProcessor.encrypt(account); // Encrypted
		EncryptionProcessor.encrypt(product); // Skipped
	}
}
