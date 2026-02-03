package com.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.functional.model.Account;

/*
 * AccountComparator
 * ---------------------
 * Compares bank accounts by balance.
 */
public class AccountComparator {

	public static void main(String[] args) {

		List<Account> list = Arrays.asList(new Account("sarthak", 92000), new Account("nishita", 18000),
				new Account("shubham", 54000));

		list.sort(Comparator.comparingDouble(Account::getBalance));

		list.forEach(System.out::println);
	}

}
