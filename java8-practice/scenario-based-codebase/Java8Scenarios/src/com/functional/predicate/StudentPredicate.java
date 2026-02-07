package com.functional.predicate;

import java.util.function.Predicate;

import com.functional.model.Student;

public class StudentPredicate {
	
	   public static void main(String[] args) {

	        Student s1 = new Student("Aman", 78, 5, 20);
	        Student s2 = new Student("Riya", 32, 18, 19);

	        // Predicate: student eligible if marks >= 40
	        Predicate<Student> isEligibleForExam =
	                s -> s.getMarks() >= 40;

	        check(s1, isEligibleForExam);
	        check(s2, isEligibleForExam);
	    }

	    static void check(Student s, Predicate<Student> rule) {
	        if (rule.test(s)) {
	            System.out.println(s.getName() + " Eligible");
	        } else {
	            System.out.println(s.getName() + " Not Eligible");
	        }
	    }

}
