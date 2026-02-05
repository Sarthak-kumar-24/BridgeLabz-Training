package com.functional.lambda;

import java.util.*;
import java.util.function.Predicate;

import com.functional.model.Account;

/*
 * BankingLambdaScenario
 * --------------------
 * Demonstrates real-time lambda
 * expressions in Banking / Finance system.
 */
public class BankingLambdaScenario {

	public static void main(String[] args) {

		// Bank accounts
		List<Account> accounts = Arrays.asList(new Account("Rahul", 12000), new Account("DeviJii", 8000),
				new Account("Sarthak", 25000), new Account("Priya", 5000));

		System.out.println("===================================");
		System.out.println(" Banking / Finance Lambda System ");
		System.out.println("===================================");

		/*--------------------------------------------------
		 1. Lambda to check minimum balance rule
		    (minimum balance = 10,000)
		--------------------------------------------------*/
		System.out.println("\n1️ Minimum Balance Check:");
		Predicate<Account> minBalanceRule = acc -> acc.getBalance() >= 10000;

		accounts.forEach(acc -> System.out.println(acc.getAccountHolder() + " : "
				+ (minBalanceRule.test(acc) ? "Minimum Balance Maintained " : "Below Minimum Balance ")));

		/*--------------------------------------------------
		 2. Lambda to calculate simple interest
		    SI = (P * R * T) / 100
		--------------------------------------------------*/
		System.out.println("\n2️ Simple Interest Calculation:");
		double principal = 10000;
		double rate = 5; // 5%
		int time = 2; // 2 years

		double simpleInterest = ((principal * rate * time) / 100);

		System.out.println("Simple Interest: Rs" + simpleInterest);

		/*--------------------------------------------------
		 3. Lambda to validate withdrawal amount
		    (withdrawal <= balance)
		--------------------------------------------------*/
		System.out.println("\n3️ Withdrawal Validation:");
		double withdrawalAmount = 7000;

		accounts.forEach(acc -> {
			if (withdrawalAmount <= acc.getBalance()) {
				System.out.println(acc.getAccountHolder() + " : Withdrawal Allowed ");
			} else {
				System.out.println(acc.getAccountHolder() + " : Insufficient Balance ");
			}
		});

		/*--------------------------------------------------
		 4. Lambda to print account details
		--------------------------------------------------*/
		System.out.println("\n4️ Account Details:");
		accounts.forEach(System.out::println);

		/*--------------------------------------------------
		 5. Lambda to compare two account balances
		--------------------------------------------------*/
		System.out.println("\n5️ Account Balance Comparison:");
		Account acc1 = accounts.get(0);
		Account acc2 = accounts.get(1);

		String result = (acc1.getBalance() > acc2.getBalance())
				? acc1.getAccountHolder() + " has higher balance than " + acc2.getAccountHolder()
				: acc2.getAccountHolder() + " has higher balance than " + acc1.getAccountHolder();

		System.out.println(result);

		System.out.println("\n===================================");
		System.out.println(" Program Completed Successfully ");
		System.out.println("===================================");
	}
}
