package com.functional.predicate;

import java.util.function.Predicate;

import com.functional.model.Employee;

public class EmployeePredicate {

	public static void main(String[] args) {

		Employee e1 = new Employee("Karan", 52000, 5);
		Employee e2 = new Employee("Neha", 28000, 2);

		// Predicate: salary > 30000
		Predicate<Employee> highSalary = e -> e.getSalary() > 30000;

		check(e1, highSalary);
		check(e2, highSalary);
	}

	static void check(Employee e, Predicate<Employee> rule) {
		if (rule.test(e)) {
			System.out.println(e.getName() + " Salary > 30k");
		} else {
			System.out.println(e.getName() + " Salary <= 30k");
		}
	}

}
