package com.functional.model;

/*
 * Account
 * -------
 * Represents a bank account with
 * basic financial details.
 */
public class Account {

	private String accountHolder;
	private double balance;

	public Account(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account Holder: " + accountHolder + " | Balance: Rs" + balance;
	}
}
