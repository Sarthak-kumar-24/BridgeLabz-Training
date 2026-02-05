package com.functional.lambda;

import java.util.*;
import java.util.function.Predicate;

import com.functional.model.Student;

/*
 * StudentLambdaScenario
 * --------------------
 * Demonstrates real-time lambda
 * expressions in a Student system.
 */
public class StudentLambdaScenario {

	public static void main(String[] args) {

		// Student list
		List<Student> students = Arrays.asList(new Student("Rahul", 82, 3, 19), new Student("Ananya", 91, 1, 18),
				new Student("Sarthak", 76, 5, 20), new Student("Priya", 38, 4, 17), new Student("Karan", 65, 2, 21));

		System.out.println("================================");
		System.out.println(" Student / School Lambda System ");
		System.out.println("================================");

		/*--------------------------------------------------
		 1. Lambda to print welcome message
		--------------------------------------------------*/
		System.out.println("\n1️ Welcome Message:");
		students.forEach(s -> System.out.println(" Welcome to the school, " + s.getName()));

		/*--------------------------------------------------
		 2. Lambda to check pass or fail (marks >= 40)
		--------------------------------------------------*/
		System.out.println("\n2️ Pass / Fail Status:");
		Predicate<Student> isPass = s -> s.getMarks() >= 40;

		students.forEach(s -> System.out.println(s.getName() + " : " + (isPass.test(s) ? "PASS " : "FAIL ")));

		/*--------------------------------------------------
		 3. Sort students by name using lambda
		--------------------------------------------------*/
		System.out.println("\n3️ Students Sorted by Name:");
		students.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).forEach(System.out::println);

		/*--------------------------------------------------
		 4. Sort students by rank using lambda
		--------------------------------------------------*/
		System.out.println("\n4️ Students Sorted by Rank:");
		students.stream().sorted((s1, s2) -> Integer.compare(s1.getRank(), s2.getRank())).forEach(System.out::println);

		/*--------------------------------------------------
		 5. Display students whose age is above 18
		--------------------------------------------------*/
		System.out.println("\n5️ Students with Age Above 18:");
		students.stream().filter(s -> s.getAge() > 18).forEach(System.out::println);

		System.out.println("\n================================");
		System.out.println(" Program Completed Successfully ");
		System.out.println("================================");
	}
}
