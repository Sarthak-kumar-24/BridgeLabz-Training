package com.constructor.levelone;

/**
 * Sub-class Name: PostgraduateStudent

 * Subclass of Student that demonstrates access to protected members.
 */
public class PostgraduateStudent extends Student {

    private String specialization;

    /**
     * Parameterized constructor
     */
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    /**
     * Displays postgraduate student details
     * Demonstrates access to protected variable 'name'
     */
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number    : " + rollNumber); // public
        System.out.println("Name           : " + name);       // protected
        System.out.println("Specialization : " + specialization);
        System.out.println("CGPA           : " + getCgpa());  // private via getter
        System.out.println("----------------------------------");
    }
    
    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student(101, "Rahul Sharma", 8.4);
        s1.displayStudentDetails();

        System.out.println("----------------------------------");

        // Modifying CGPA using public setter
        s1.setCgpa(8.9);
        System.out.println("Updated CGPA: " + s1.getCgpa());

        System.out.println("----------------------------------");

        // Creating PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(
                201, "Sarthak Singh Rathore", 9.1, "Computer Science");

        pg.displayPostgraduateDetails();
    }
}

