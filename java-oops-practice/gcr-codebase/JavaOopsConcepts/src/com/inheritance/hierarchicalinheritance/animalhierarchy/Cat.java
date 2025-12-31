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

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

}
