package com.annotations.createannotationforpendingtasks;

import java.lang.reflect.Method;

class ProjectService {

	@Todo(task = "Implement login functionality", assignedTo = "Sarthak", priority = "HIGH")
	public void login() {
		System.out.println("Login logic");
	}

	@Todo(task = "Add password reset feature", assignedTo = "Aman"
	// priority not provided → default MEDIUM
	)
	public void resetPassword() {
		System.out.println("Reset password logic");
	}

	@Todo(task = "Optimize database queries", assignedTo = "DevJii", priority = "LOW")
	public void optimizeDB() {
		System.out.println("DB optimization");
	}

	// Not a pending task
	public void helperMethod() {
		System.out.println("Helper");
	}

	public static void main(String[] args) {

		// Create object of ProjectService
		ProjectService service = new ProjectService();

		// Get Class object
		Class<?> clazz = service.getClass();

		// Get all declared methods
		Method[] methods = clazz.getDeclaredMethods();

		System.out.println(" PENDING TASKS\n");

		// Loop through methods
		for (Method method : methods) {

			// Check if method has @Todo annotation
			if (method.isAnnotationPresent(Todo.class)) {

				// Retrieve annotation
				Todo todo = method.getAnnotation(Todo.class);

				// Print task details
				System.out.println("Method     : " + method.getName());
				System.out.println("Task       : " + todo.task());
				System.out.println("Assigned To: " + todo.assignedTo());
				System.out.println("Priority   : " + todo.priority());
				System.out.println("----------------------------------");
			}
		}
	}

}
