package com.functional.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.functional.model.Student;

/*
 * StudentComparator
 * ---------------------
 * Demonstrates Comparator to compare students by rank.
 */
public class StudentComparator {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("sarthak", 88, 3, 20), new Student("nishita", 91, 1, 19),
				new Student("shubham", 72, 7, 21));

		// lower rank = better
		Comparator<Student> byRank = (a, b) -> Integer.compare(a.getRank(), b.getRank());

		list.sort(byRank);

		list.forEach(System.out::println);
	}

}
