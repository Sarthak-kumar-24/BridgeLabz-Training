package com.functional.lambda;

import java.util.*;
import java.util.function.Predicate;

import com.functional.model.Employee;

/*
 * EmployeeLambdaScenario
 * ---------------------
 * Demonstrates real-time lambda
 * expressions in an Office system.
 */
public class EmployeeLambdaScenario {

	public static void main(String[] args) {

		// Employee list
		List<Employee> employees = Arrays.asList(new Employee("Rahul", 45000, 4), new Employee("DeviJii", 28000, 2),
				new Employee("Sarthak", 52000, 5), new Employee("Priya", 30000, 3), new Employee("Karan", 60000, 6));

		System.out.println("===================================");
		System.out.println(" Employee / Office Lambda System ");
		System.out.println("===================================");

		/*--------------------------------------------------
		 1. Lambda to calculate employee bonus
		    (salary > 30,000 → 10% bonus)
		--------------------------------------------------*/
		System.out.println("\n1️ Employee Bonus Calculation:");
		employees.forEach(e -> {
			if (e.getSalary() > 30000) {
				double bonus = e.getSalary() * 0.10;
				System.out.println(e.getName() + " Bonus: Rs" + bonus);
			}
		});

		/*--------------------------------------------------
		 2. Sort employees by salary using lambda
		--------------------------------------------------*/
		System.out.println("\n2️ Employees Sorted by Salary:");
		employees.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.forEach(System.out::println);

		/*--------------------------------------------------
		 3. Lambda to check promotion eligibility
		    (experience > 3 years)
		--------------------------------------------------*/
		System.out.println("\n3️ Promotion Eligibility:");
		Predicate<Employee> promotionEligible = e -> e.getExperience() > 3;

		employees.forEach(e -> System.out
				.println(e.getName() + " : " + (promotionEligible.test(e) ? "Eligible " : "Not Eligible ")));

		/*--------------------------------------------------
		 4. Lambda to print employee details
		--------------------------------------------------*/
		System.out.println("\n4️ Employee Details:");
		employees.forEach(System.out::println);

		/*--------------------------------------------------
		 5. Lambda to compare two employees’ salaries
		--------------------------------------------------*/
		System.out.println("\n5️ Salary Comparison:");
		Employee e1 = employees.get(0);
		Employee e2 = employees.get(1);

		String result = (e1.getSalary() > e2.getSalary()) ? e1.getName() + " has higher salary than " + e2.getName()
				: e2.getName() + " has higher salary than " + e1.getName();

		System.out.println(result);

		System.out.println("\n===================================");
		System.out.println(" Program Completed Successfully ");
		System.out.println("===================================");
	}
}
