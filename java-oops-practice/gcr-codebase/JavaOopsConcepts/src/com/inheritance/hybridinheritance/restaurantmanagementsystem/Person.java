package com.inheritance.hybridinheritance.restaurantmanagementsystem;

/*Restaurant Management System
 * 
 * Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. 
 * Both Chef and Waiter should implement a Worker interface that requires a performDuties() method
 * 
 * 
 * Create an interface Worker with a method performDuties().
 * Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, 
 * each providing a unique implementation of performDuties().

 */
public class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public static void main(String[] args) {

        Worker w1 = new Chef("Aman", 101);
        Worker w2 = new Waiter("Riya", 102);

        w1.performDuties();
        w2.performDuties();
    }
}

