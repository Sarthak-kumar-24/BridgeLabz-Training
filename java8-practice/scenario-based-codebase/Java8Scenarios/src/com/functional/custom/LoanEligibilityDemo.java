package com.functional.custom;

import com.functional.model.Account;

/*
 * LoanEligibilityDemo
 * -------------------
 * Checks loan eligibility using custom FI.
 */
public class LoanEligibilityDemo {

	public static void main(String[] args) {

		Account acc = new Account("nishita", 95000);

		LoanEligibilityChecker checker = bal -> bal >= 50000;

		System.out.println(" Loan eligible: " + checker.check(acc.getBalance()));
	}
}
