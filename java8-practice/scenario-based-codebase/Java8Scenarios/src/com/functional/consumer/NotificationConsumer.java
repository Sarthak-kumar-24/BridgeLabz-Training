package com.functional.consumer;

import java.util.function.Consumer;

import com.functional.model.Account;

/*
 * NotificationConsumer
 * ------------------------
 * Demonstrates use of Consumer functional interface.
 * Sends a notification message for an account event.
 */
public class NotificationConsumer {

	public static void main(String[] args) {

		Account a1 = new Account("sarthak", 92000);
		Account a2 = new Account("nishita", 18400);

		// Consumer: action = send notification
		Consumer<Account> notifyUser = acc -> System.out.println(
				" Notification sent to " + acc.getAccountHolder() + " | Current Balance: Rs " + acc.getBalance());

		notifyUser.accept(a1);
		notifyUser.accept(a2);
	}

}
