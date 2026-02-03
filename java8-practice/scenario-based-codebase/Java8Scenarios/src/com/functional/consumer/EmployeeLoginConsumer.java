package com.functional.consumer;

import java.time.LocalDateTime;
import java.util.function.Consumer;

import com.functional.model.Employee;

/*
 * EmployeeLoginConsumer
 * -------------------------
 * Demonstrates use of Consumer functional interface.
 * Logs employee login activity using lambda.
 */
public class EmployeeLoginConsumer {

	public static void main(String[] args) {

		Employee e1 = new Employee("Sarthak", 65000, 5);
		Employee e2 = new Employee("Devijii", 42000, 3);

		// Consumer: action = log login event
		Consumer<Employee> loginLogger = e -> System.out
				.println(" LOGIN LOG | User: " + e.getName() + " | Time: " + LocalDateTime.now());

		loginLogger.accept(e1);
		loginLogger.accept(e2);
	}

}
