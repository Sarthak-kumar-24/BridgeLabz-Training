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
public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking delicious food ");
    }
}
