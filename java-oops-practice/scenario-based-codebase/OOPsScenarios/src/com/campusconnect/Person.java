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
public abstract class Person {
	protected String name;
	protected String email;
	protected int id;
	
	
	Person( String name, String email, int id){
		this.name = name;
		this.email= email;
		this.id = id;
	}
	
	String getName() {
		return this.name;
	}
	String getMail() {
		return this.email;
	}
	int getID() {
		return this.id;
	}
	
	public abstract void printDetails(); 

	

	public static void main(String[] args) {
		System.out.println("\n============== CAMPUSCONNECT : ACADEMIC MODULE =============\n");
        Faculty f1 = new Faculty( "Dr. Sharma", "sharma@uni.edu",1, "CSE");

        Student s1 = new Student( "Aman", "aman@uni.edu", 101);
        Student s2 = new Student( "DeviJii", "devijii@uni.edu", 102);
        Student s3 = new Student( "Sarthak", "sarthak@uni.edu", 102);
        Student s4 = new Student( "Saurav", "saurav@uni.edu", 103);
        Student s5 = new Student( "harsh", "harsh@uni.edu", 104);
        Student s6 = new Student( "Vivek", "vivek@uni.edu", 105);
        Student s7 = new Student( "Neha", "neha@uni.edu", 106);
        Student s8 = new Student( "Shreya", "shreya@uni.edu", 107);

        s1.addGrade(8);
        s1.addGrade(9);
        s3.addGrade(8);
        s3.addGrade(9);
        s4.addGrade(5);
        s4.addGrade(9);
        s5.addGrade(8);
        s5.addGrade(10);
        s6.addGrade(8);
        s6.addGrade(10);
        s7.addGrade(9);
        s7.addGrade(9);

        s2.addGrade(7);
        s2.addGrade(8);

        Course c1 = new Course("Object Oriented Programming", f1);
        Course c2 = new Course("Computer Science", f1);
        Course c3 = new Course("Data Structure", f1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s3.enrollCourse(c2);
        s4.enrollCourse(c3);
        s5.enrollCourse(c1);
        s6.enrollCourse(c3);
        s7.enrollCourse(c2);

        // Polymorphism
 
        

        s1.printDetails();
        System.out.println();
        s2.printDetails();
        s3.printDetails();
        s4.printDetails();
        s5.printDetails();
        s6.printDetails();
        s7.printDetails();

        c1.printCourseDetails();
        c2.printCourseDetails();
        c3.printCourseDetails();
		

	}

}
