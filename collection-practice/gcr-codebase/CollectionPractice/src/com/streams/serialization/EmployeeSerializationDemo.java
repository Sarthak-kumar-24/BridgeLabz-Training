package com.streams.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * EmployeeSerializationDemo
 *
 * This class demonstrates: - Serialization of a list of Employee objects -
 * Deserialization of the same list from a file - Proper exception handling
 */
public class EmployeeSerializationDemo {

	public static void main(String[] args) {

		// File where employee data will be stored
		String fileName = "employees.dat";

		// Create a list of employees
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Aarav", "IT", 75000));
		employeeList.add(new Employee(102, "Meera", "HR", 65000));
		employeeList.add(new Employee(103, "Rohan", "Finance", 80000));

		// ---------- SERIALIZATION ----------
		System.out.println(" Serializing employee list...");

		try {
			// ObjectOutputStream writes objects to file
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

			// Write entire list into file
			oos.writeObject(employeeList);

			// Close stream
			oos.close();

			System.out.println(" Employees serialized successfully.\n");

		} catch (IOException e) {
			System.out.println(" Serialization failed: " + e.getMessage());
		}

		// ---------- DESERIALIZATION ----------
		System.out.println(" Deserializing employee list...");

		try {
			// ObjectInputStream reads objects from file
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

			// Read object and cast back to ArrayList<Employee>
			ArrayList<Employee> retrievedList = (ArrayList<Employee>) ois.readObject();

			// Close stream
			ois.close();

			System.out.println(" Employees deserialized successfully.\n");

			// Display employee details
			System.out.println(" Employee Details:");
			for (Employee e : retrievedList) {
				System.out.println(e);
			}

		} catch (IOException e) {
			System.out.println(" I/O Error during deserialization: " + e.getMessage());

		} catch (ClassNotFoundException e) {
			System.out.println(" Class not found: " + e.getMessage());
		}
	}

}
