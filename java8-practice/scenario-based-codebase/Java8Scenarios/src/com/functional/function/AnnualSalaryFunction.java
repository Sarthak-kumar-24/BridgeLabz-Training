package com.functional.function;

import java.util.function.Function;

import com.functional.model.Employee;

/*
 * AnnualSalaryFunction
 * ------------------------
 * Demonstrates use of Function in payroll scenario.
 * Converts monthly salary into annual salary.
 */
public class AnnualSalaryFunction {

	public static void main(String[] args) {

		Employee e1 = new Employee("Karan", 45000, 6);
		Employee e2 = new Employee("Neha", 28000, 2);

		// Function: Employee -> Annual Salary
		Function<Employee, Double> annualSalaryFn = e -> e.getSalary() * 12;

		printAnnual(e1, annualSalaryFn);
		printAnnual(e2, annualSalaryFn);
	}

	static void printAnnual(Employee e, Function<Employee, Double> fn) {

		double annual = fn.apply(e);
		System.out.println(e.getName() + " Annual Salary = Rs " + annual);
	}

}
