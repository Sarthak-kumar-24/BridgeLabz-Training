package com.collectors.employeesalarycategorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Sample employee list
		List<Employee> employees = Arrays.asList(new Employee("Aman", "IT", 70000), new Employee("Riya", "HR", 50000),
				new Employee("Kunal", "IT", 90000), new Employee("DeviJii", "HR", 60000),
				new Employee("Arjun", "Sales", 65000));

		//  Core Logic:
		// Group by department -> calculate average salary
		Map<String, Double> avgSalaryByDept = employees.stream()

				// groupingBy -> creates Map<Department, value>
				.collect(Collectors.groupingBy(

						// key mapper -> department name
						Employee::getDepartment,

						// downstream collector -> average of salary
						Collectors.averagingDouble(Employee::getSalary)));

		// Print result
		System.out.println(avgSalaryByDept);
	}

}
