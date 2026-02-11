package com.jdbc.employeemanagementsystem;

import java.util.Scanner;

/*
 * Main class containing menu-driven logic
 */
public class EmployeeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();

		while (true) {

			// Display menu
			System.out.println("\n--- Employee Management System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. Update Employee Salary");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee by Name");
			System.out.println("6. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter name: ");
				sc.nextLine(); // consume newline
				String name = sc.nextLine();

				System.out.print("Enter salary: ");
				double salary = sc.nextDouble();

				dao.addEmployee(new Employee(name, salary));
				break;

			case 2:
				dao.viewAllEmployees();
				break;

			case 3:
				System.out.print("Enter employee ID: ");
				int id = sc.nextInt();

				System.out.print("Enter new salary: ");
				double newSalary = sc.nextDouble();

				dao.updateSalary(id, newSalary);
				break;

			case 4:
				System.out.print("Enter employee ID: ");
				int delId = sc.nextInt();

				dao.deleteEmployee(delId);
				break;

			case 5:
				System.out.print("Enter name to search: ");
				sc.nextLine();
				String searchName = sc.nextLine();

				dao.searchEmployeeByName(searchName);
				break;

			case 6:
				System.out.println("Exiting application...");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid option!");
			}
		}
	}
}
