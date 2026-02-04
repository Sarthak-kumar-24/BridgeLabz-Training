package com.functional.custom;

import com.functional.model.Employee;

/*
 * BonusCalculatorDemo
 * -------------------
 * Uses custom functional interface to calculate bonus.
 */
public class BonusCalculatorDemo {

	public static void main(String[] args) {

		Employee e = new Employee("sarthak", 60000, 5);

		BonusCalculator bonusFn = sal -> sal * 0.15;

		double bonus = bonusFn.calculate(e.getSalary());

		System.out.println(" Bonus for " + e.getName() + " = Rs " + bonus);
	}
}
