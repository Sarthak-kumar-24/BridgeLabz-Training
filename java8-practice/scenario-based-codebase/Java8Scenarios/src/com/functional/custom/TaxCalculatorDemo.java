package com.functional.custom;

import com.functional.model.Employee;

/*
 * TaxCalculatorDemo
 * -----------------
 * Calculates tax using custom FI.
 */
public class TaxCalculatorDemo {

	public static void main(String[] args) {

		Employee e = new Employee("devijii", 72000, 6);

		TaxCalculator taxFn = sal -> sal * 0.10;

		System.out.println(" Tax = Rs " + taxFn.tax(e.getSalary()));
	}
}