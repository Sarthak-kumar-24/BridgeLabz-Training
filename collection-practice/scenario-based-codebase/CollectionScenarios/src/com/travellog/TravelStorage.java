package com.travellog;

import java.io.*;
import java.util.List;

/**
 * TravelStorage -------------- Handles saving and loading Trip objects using
 * Java ObjectOutputStream and ObjectInputStream.
 */
public class TravelStorage {

	public static void saveTrips(List<Trip> trips, String fileName) throws IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

		oos.writeObject(trips);
		oos.close();
	}

	@SuppressWarnings("unchecked")
	public static List<Trip> loadTrips(String fileName) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

		List<Trip> trips = (List<Trip>) ois.readObject();
		ois.close();
		return trips;
	}
}
