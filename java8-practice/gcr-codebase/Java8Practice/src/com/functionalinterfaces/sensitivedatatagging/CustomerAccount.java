package com.functionalinterfaces.sensitivedatatagging;

/*
 * CustomerAccount
 * ----------------
 * Contains sensitive information
 * and must be encrypted.
 */
public class CustomerAccount implements SensitiveData {

	private String accountNumber;
	private String password;

	public CustomerAccount(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerAccount [accountNumber=" + accountNumber + ", password=" + password + "]";
	}
}
