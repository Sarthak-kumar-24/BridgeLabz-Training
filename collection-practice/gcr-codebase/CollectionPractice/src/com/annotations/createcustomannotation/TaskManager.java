package com.annotations.createcustomannotation;

import java.lang.reflect.Method;

class TaskManager {

	// Applying custom annotation to method
	@TaskInfo(priority = 1, assignedTo = "Sarthak")
	public void completeTask() {
		System.out.println("Task is being completed...");
	}

	public static void main(String[] args) {

		try {
			// Create object of TaskManager
			TaskManager manager = new TaskManager();

			// Get Class object
			Class<?> clazz = manager.getClass();

			// Get method object
			Method method = clazz.getMethod("completeTask");

			// Check if annotation is present
			if (method.isAnnotationPresent(TaskInfo.class)) {

				// Retrieve annotation
				TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

				// Access annotation values
				System.out.println("Priority    : " + taskInfo.priority());
				System.out.println("Assigned To : " + taskInfo.assignedTo());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
