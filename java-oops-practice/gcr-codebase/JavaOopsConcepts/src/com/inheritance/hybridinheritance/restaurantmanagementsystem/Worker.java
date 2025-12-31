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
public interface Worker {
	
	void performDuties();

}
