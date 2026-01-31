package com.collectors.studentresultgrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		// Create list of students
		List<Student> students = Arrays.asList(new Student("Aman", "A"), new Student("Riya", "B"),
				new Student("DeviJii", "A"), new Student("Sneha", "C"), new Student("Rahul", "B"));

		// Core Logic:
		// Stream the list -> group by grade -> collect only names
		Map<String, List<String>> grouped = students.stream()

				// groupingBy = creates Map<grade, list>
				.collect(Collectors.groupingBy(

						// key mapper -> group based on grade
						Student::getGrade,

						// value collector -> collect only names instead of full objects
						Collectors.mapping(Student::getName, Collectors.toList())));

		// Print result
		System.out.println(grouped);
	}

}
