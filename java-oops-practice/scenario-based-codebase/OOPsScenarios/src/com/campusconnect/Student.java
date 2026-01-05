package com.campusconnect;

import java.util.ArrayList;
import java.util.List;


/* CampusConnect – College Information System
 * 
 * Person (base class): common fields like name, email, id.
 * Student and Faculty extend Person (use inheritance).
 * ICourseActions interface with methods like enrollCourse() and dropCourse().
 * Course class has a list of students and a faculty assigned.
 * Use access modifiers: student grades must be private.
 * Polymorphism: printDetails() works differently for Student and Faculty.
 * 
 */
public class Student extends Person implements ICourseActions {
	
	private List<Integer> grades; // encapsulated
    private List<Course> courses;
    
    
	public Student( String name, String email, int id){
		super( name, email, id);
		grades = new ArrayList<>();
        courses = new ArrayList<>();
	}
	
	  public void addGrade(int grade) {
	        grades.add(grade);
	    }
	  
	   public double calculateGPA() {
	        int sum = 0;
	        for (int g : grades) {
	            sum += g;
	        }
	        return grades.isEmpty() ? 0 : (double) sum / grades.size();
	    }
	   @Override
	    public void enrollCourse(Course c) {
	        courses.add(c);
	        c.addStudent(this);
	    }
	    @Override
	    public void dropCourse(Course c) {
	        courses.remove(c);
	        c.removeStudent(this);
	    }

		@Override
		public void printDetails() {
		    System.out.println("====================================");
		    System.out.println(" STUDENT DETAILS");
		    System.out.println("------------------------------------");
		    System.out.println("ID        : " + id);
		    System.out.println("Name      : " + name);
		    System.out.println("Email     : " + email);
		    System.out.println("GPA       : " + calculateGPA());
		    System.out.println("====================================");
		}

}
