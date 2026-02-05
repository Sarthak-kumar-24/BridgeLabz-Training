package com.functional.function;

import java.util.function.Function;

import com.functional.model.Student;

/*
 * StudentGradeFunction
 * ------------------------
 * Demonstrates use of Function functional interface.
 * Converts student marks into grade using lambda.
 */
public class StudentGradeFunction {

	public static void main(String[] args) {

		Student s1 = new Student("Aman", 85, 3, 20);
		Student s2 = new Student("Riya", 67, 10, 19);
		Student s3 = new Student("Kabir", 42, 25, 21);

		// Function: Student -> Grade
		Function<Student, String> gradeFunction = s -> {
			int m = s.getMarks();

			if (m >= 80)
				return "A";
			else if (m >= 60)
				return "B";
			else
				return "C";
		};

		printGrade(s1, gradeFunction);
		printGrade(s2, gradeFunction);
		printGrade(s3, gradeFunction);
	}

	static void printGrade(Student s, Function<Student, String> fn) {
		String grade = fn.apply(s);
		System.out.println(s.getName() + " Grade = " + grade);
	}

}
