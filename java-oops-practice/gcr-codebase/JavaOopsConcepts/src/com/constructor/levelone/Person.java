package com.constructor.levelone;

/**
 * Created a class named Person that 
 * Represents a Person with basic attributes.
 * Demonstrates the use of a copy constructor
 * to clone another Person object's data.
 */
public class Person {

    // Instance variables
    private String name;
    private int age;

    /**
     * Parameterized Constructor
     * Initializes the person with given values.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Copy Constructor
     * Creates a new Person object by copying
     * the attributes of another Person object.

     */
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    /**
     * Displays person details.
     */
    public void displayPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Sarthak", 21);

        System.out.println("Original Person:");
        p1.displayPersonDetails();

        System.out.println("-------------------------");

        // Cloned object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Cloned Person:");
        p2.displayPersonDetails();
    }
}
