package com.lambdaexp.smarthomelightingautomation;

public class SmartHomeLightingApp {

	public static void main(String[] args) {

		SmartLightController controller = new SmartLightController();

		//  Motion detected -> Turn on hallway lights
		controller.trigger(() -> {
			System.out.println("Motion detected!");
			System.out.println("Turning ON hallway lights.");
		});

		//  Time-based trigger -> Night mode lighting
		controller.trigger(() -> {
			System.out.println("It's 10 PM.");
			System.out.println("Activating dim warm lights for night mode.");
		});

		// Voice command -> Party mode
		controller.trigger(() -> {
			System.out.println("Voice Command: 'Party Mode'");
			System.out.println("Switching lights to RGB colors ");
		});
	}
}
