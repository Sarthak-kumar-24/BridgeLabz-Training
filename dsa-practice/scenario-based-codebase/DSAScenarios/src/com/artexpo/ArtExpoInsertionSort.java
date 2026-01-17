package com.artexpo;

public class ArtExpoInsertionSort {

	public static void sortByRegistrationTime(Artist[] artists) {

		for (int i = 1; i < artists.length; i++) {
			Artist key = artists[i];
			int j = i - 1;

			while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
				artists[j + 1] = artists[j];
				j--;
			}
			artists[j + 1] = key;
		}

	}

	public static void main(String[] args) {

		Artist[] artists = { new Artist("Aarav", 35), 
				             new Artist("Meera", 10), 
				             new Artist("Rohan", 25),
				             new Artist("Isha", 15) };

		System.out.println("Before Sorting:");
		for (Artist a : artists) {
			System.out.println(a.name + " - " + a.registrationTime);
		}

		sortByRegistrationTime(artists);

		System.out.println("\nAfter Sorting (by Registration Time):");
		for (Artist a : artists) {
			System.out.println(a.name + " - " + a.registrationTime);
		}
	}
}
