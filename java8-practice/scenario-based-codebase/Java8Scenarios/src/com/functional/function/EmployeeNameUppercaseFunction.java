package com.functional.function;

import java.util.function.Function;

import com.functional.model.Employee;

/*
 * EmployeeNameUppercaseFunction
 * ---------------------------------
 * Demonstrates use of Function for data transformation.
 * Converts employee name into uppercase.
 */
public class EmployeeNameUppercaseFunction {

	public static void main(String[] args) {

		Employee e1 = new Employee("Sarthak", 55000, 4);
		Employee e2 = new Employee("DeviJii", 32000, 2);

		// Function: Employee -> Uppercase Name
		Function<Employee, String> upperFn = e -> e.getName().toUpperCase();

		printUpper(e1, upperFn);
		printUpper(e2, upperFn);
	}

	static void printUpper(Employee e, Function<Employee, String> fn) {

		String upperName = fn.apply(e);

		System.out.println("Original: " + e.getName() + " | Uppercase: " + upperName);
	}

}
