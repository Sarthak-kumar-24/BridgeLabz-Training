package com.annotations.useOverride;

//Child class Dog inherits Animal
class Dog extends Animal {

	// correctly overrides the parent class method
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}

	// Parent class
	class Animal {

		// Method in parent class
		// This method will be overridden by child classes
		void makeSound() {
			System.out.println("Animal makes a sound");
		}
	}

	public static void main(String[] args) {

		// Creating object of Dog class
		Dog dog = new Dog();

		// Calling overridden method
		// Runtime Polymorphism happens here
		dog.makeSound();
	}

}
