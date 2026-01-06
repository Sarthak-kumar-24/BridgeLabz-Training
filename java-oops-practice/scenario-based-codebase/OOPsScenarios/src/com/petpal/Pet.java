package com.petpal;

/*
 * PetPal – Virtual Pet Care App
 * 
 *  You’re creating PetPal, an app that allows users to adopt and care for virtual pets like dogs, cats, and birds.
 * 
 * 
 * Pet base class: name, type, age.
 * Derived classes: Dog, Cat, Bird (use inheritance).
 * IInteractable interface with methods like feed(), play(), sleep().
 * Encapsulation of hunger and mood levels.
 * 
 */
public abstract class Pet implements IInteractable {

	protected String name;
	protected String petType;
	protected int age;

	private int hunger; // 0 = full, 100 = very hungry
	private int energy; // 0 = tired, 100 = energetic
	private String mood;

	Pet(String name, String petType, int age) {
		this.name = name;
		this.petType = petType;
		this.age = age;
		this.hunger = 50;
		this.energy = 50;
		updateMood();
	}

	protected void increaseEnergy(int value) {
		energy = Math.min(100, energy + value);
		updateMood();
	}

	protected void decreaseEnergy(int value) {
		energy = Math.max(0, energy - value);
		updateMood();
	}

	protected void increaseHunger(int value) {
		hunger = Math.min(100, hunger + value);
		updateMood();
	}

	protected void decreaseHunger(int value) {
		hunger = Math.max(0, hunger - value);
		updateMood();
	}

	private void updateMood() {
		if (energy > 70 && hunger < 30)
			mood = "Happy";
		else if (energy < 30)
			mood = "Tired";
		else if (hunger > 70)
			mood = "Hungry";
		else
			mood = "Normal";
	}

	public void showStatus() {
		System.out.println("Name    : " + name);
		System.out.println("Type    : " + petType);
		System.out.println("Age     : " + age);
		System.out.println("Energy  : " + energy);
		System.out.println("Hunger  : " + hunger);
		System.out.println("Mood    : " + mood);
	}

	
	public abstract void makeSound();

	static void header(String title) {
		System.out.println("\n=================================");
		System.out.println(" " + title.toUpperCase());
		System.out.println("=================================");
	}

	public static void main(String[] args) {

		header("PetPal Virtual Pet Care");

		
		Pet[] pets = { new Dog("Buddy", 3), new Cat("Whiskers", 2), new Bird("Kiwi", 1) };

		// Loop through pets
		for (Pet pet : pets) {

			System.out.println("\n--- Pet Status ---");
			pet.showStatus();

			System.out.println("\n--- Interactions ---");
			pet.makeSound();
			pet.play();
			pet.feed();
			pet.sleep();

			System.out.println("\n--- Updated Status ---");
			pet.showStatus();
		}

		header("Session Ended");
	}

}
