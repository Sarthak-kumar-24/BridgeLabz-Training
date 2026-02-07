package com.functional.predicate;

import java.util.function.Predicate;

import com.functional.model.Account;

/*
 * BankPredicateDemo
 * -----------------
 * Demonstrates use of Predicate in a banking scenario.
 * Checks whether a withdrawal amount is valid
 * based on account balance and basic rules.
 */
public class BankPredicate {

	public static void main(String[] args) {

		Account acc = new Account("Sarthak", 50000);

		double withdrawal1 = 12000;
		double withdrawal2 = 70000;

		// Predicate: valid amount rule (>0 and <= balance)
		Predicate<Double> validAmount = amt -> amt > 0 && amt <= acc.getBalance();

		checkWithdrawal(acc, withdrawal1, validAmount);
		checkWithdrawal(acc, withdrawal2, validAmount);
	}

	static void checkWithdrawal(Account acc, double amount, Predicate<Double> rule) {

		if (rule.test(amount)) {
			System.out.println(" Withdrawal allowed: Rs " + amount);
		} else {
			System.out.println(" Invalid withdrawal: Rs " + amount);
		}
	}
}
