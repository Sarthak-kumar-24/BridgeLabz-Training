package com.functionalinterfaces.sensitivedatatagging;

/*
 * EncryptionProcessor
 * -------------------
 * Encrypts only classes marked
 * with SensitiveData interface.
 */
public class EncryptionProcessor {

	public static void encrypt(Object obj) {

		// Check marker interface at runtime
		if (obj instanceof SensitiveData) {
			System.out.println(" Encrypting sensitive data: " + obj);
		} else {
			System.out.println(" No encryption needed for: " + obj.getClass().getSimpleName());
		}
	}
}