package com.functional.consumer;

import java.util.function.Consumer;

import com.functional.model.Student;

/*
 * StudentConsumer
 * -------------------
 * Demonstrates use of Consumer functional interface.
 * Prints student details using lambda expression.
 */
public class StudentConsumer {

	public static void main(String[] args) {

		Student s1 = new Student("sarthak", 88, 2, 20);
		Student s2 = new Student("nishita", 74, 8, 19);
		Student s3 = new Student("shubham", 61, 15, 21);

		// Consumer: action = print student
		Consumer<Student> printStudent = s -> System.out.println(" " + s);

		printStudent.accept(s1);
		printStudent.accept(s2);
		printStudent.accept(s3);
	}

}
