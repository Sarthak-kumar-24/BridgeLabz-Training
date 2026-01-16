package com.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
=========================================================
Program: Group Objects by Property
Purpose:
- Given a list of Employee objects
- Group them by department
- Result stored as Map<Department, List<Employee>>
=========================================================
*/
public class GroupEmployeesByDepartment {

	// Employee class
	static class Employee {
		String name;
		String department;

		Employee(String name, String department) {
			this.name = name;
			this.department = department;
		}

		public String getDepartment() {
			return department;
		}

		public String getName() {
			return name;
		}
	}

	// Method to group employees by department
	private static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : employees) {
			deptMap.computeIfAbsent(emp.getDepartment(), d -> new ArrayList<>()).add(emp);
		}

		return deptMap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		// Input employees
		for (int i = 0; i < n; i++) {
			System.out.print("Enter employee name: ");
			String name = sc.nextLine();

			System.out.print("Enter department: ");
			String dept = sc.nextLine();

			employees.add(new Employee(name, dept));
		}

		// Group employees
		Map<String, List<Employee>> grouped = groupByDepartment(employees);

		// Output
		System.out.println("\nGrouped Employees:");
		for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			List<Employee> list = entry.getValue();
			for (Employee e : list) {
				System.out.print(e.getName() + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
