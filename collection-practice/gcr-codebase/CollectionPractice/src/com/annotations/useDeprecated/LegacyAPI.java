package com.annotations.useDeprecated;

public class LegacyAPI {

	// @Deprecated tells developers and compiler that
	// this method is no longer recommended
	@Deprecated
	void oldFeature() {
		System.out.println("Old feature is executed");
	}

	// This is the new recommended method
	void newFeature() {
		System.out.println("New feature is executed");
	}

	public static void main(String[] args) {

		// Creating object of LegacyAPI
		LegacyAPI api = new LegacyAPI();

		// Calling deprecated method
		// Compiler will give a warning (not an error)
		api.oldFeature();

		// Calling new recommended method
		api.newFeature();
	}

}
