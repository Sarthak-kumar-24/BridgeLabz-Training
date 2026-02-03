package com.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.functional.model.Employee;

/*
 * EmployeeComparator
 * ----------------------
 * Compares employees by salary.
 */
public class EmployeeComparator {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("Devijii", 52000, 5), new Employee("Sarthak", 78000, 7),
				new Employee("Nishita", 41000, 3));

		Comparator<Employee> bySalary = Comparator.comparingDouble(Employee::getSalary);

		list.sort(bySalary);

		list.forEach(System.out::println);
	}
}
