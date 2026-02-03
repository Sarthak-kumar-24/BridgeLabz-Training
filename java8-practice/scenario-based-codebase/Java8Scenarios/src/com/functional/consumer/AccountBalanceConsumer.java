package com.functional.consumer;

import java.util.function.Consumer;

import com.functional.model.Account;

/*
 * AccountBalanceConsumer
 * --------------------------
 * Demonstrates use of Consumer functional interface.
 * Displays account balance using lambda expression.
 */
public class AccountBalanceConsumer {
	public static void main(String[] args) {

		Account a1 = new Account("Sarthak", 80500);
		Account a2 = new Account("Devijii", 15200);

		// Consumer: action = display balance
		Consumer<Account> showBalance = acc -> System.out
				.println(" Account Holder: " + acc.getAccountHolder() + " | Balance: Rs " + acc.getBalance());

		showBalance.accept(a1);
		showBalance.accept(a2);
	}

}
