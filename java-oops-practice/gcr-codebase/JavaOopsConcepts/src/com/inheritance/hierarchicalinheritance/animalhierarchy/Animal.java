package com.inheritance.hierarchicalinheritance.animalhierarchy;

/*
 * Animal Hierarchy
 * 
 * Description: Create a hierarchy where Animal is the superclass, 
 * and Dog, Cat, and Bird are subclasses. 
 * Each subclass has a unique behavior.
 * 
 * 
 * Define a superclass Animal with attributes name and age, and a method makeSound().
 * Define subclasses Dog, Cat, and Bird, 
 * each with a unique implementation of makeSound().
 */
public class Animal  {
	
	private String name;
	private int age;
	
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
	
	public void makeSound() {
		
		System.out.println("Animal makes a sound");
	}
	

	public static void main(String[] args) {

        Animal dog = new Dog("Bruno", 7);
        Animal cat = new Cat("Whiskers", 6);
        Animal bird = new Bird("Tweety", 4);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
		

	}

}
