package com.campusconnect;

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
public class Faculty extends Person {
	
	 private String department;
	
	
	
	
	Faculty( String name, String email, int id,  String department){
		super(name, email, id);
		 this.department = department;
		
	}
	
	@Override
	public void printDetails() {
	    System.out.println("====================================");
	    System.out.println(" FACULTY DETAILS");
	    System.out.println("------------------------------------");
	    System.out.println("ID        : " + id);
	    System.out.println("Name      : " + name);
	    System.out.println("Email     : " + email);
	    System.out.println("Department: " + department);
	    System.out.println("====================================");
	}
	
	

}
