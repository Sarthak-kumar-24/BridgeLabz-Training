package com.parkease;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * ParkEase – Smart Parking Management System
 * 
 * A city wants a smart parking solution that can assign parking slots, calculate charges,
 * and track availability in real time.
 */
public class ParkingSystem {

	private List<ParkingSlot> slots = new ArrayList<>();

	public void addSlot(ParkingSlot slot) {
		slots.add(slot);
	}

	public ParkingSlot findAvailableSlot(String vehicleType) {
		for (ParkingSlot slot : slots) {
			if (!slot.isOccupied() && slot.getVehicleTypeAllowed().equals(vehicleType)) {
				return slot;
			}
		}
		return null;
	}

	public void printAvailability() {
		System.out.println("\n Parking Availability");
		System.out.println("------------------------------------");
		for (ParkingSlot slot : slots) {
			System.out.println("Slot " + slot.getSlotId() + " | Type: " + slot.getVehicleTypeAllowed() + " | Status: "
					+ (slot.isOccupied() ? "OCCUPIED" : "AVAILABLE"));
		}
	}
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");

		ParkingSystem system = new ParkingSystem();
		system.addSlot(new ParkingSlot("C1", "Car"));
		system.addSlot(new ParkingSlot("B1", "Bike"));
		system.addSlot(new ParkingSlot("T1", "Truck"));

		Vehicle vehicle = new Car("DL-01-AX-2025");
		int parkingHours = 4;

		printHeader();

		ParkingSlot slot = system.findAvailableSlot(vehicle.getType());

		if (slot != null && slot.assignVehicle(vehicle)) {
			System.out.println(" Vehicle Parked Successfully");
			System.out.println("------------------------------------");
			System.out.println("Vehicle No     : " + vehicle.getVehicleNumber());
			System.out.println("Vehicle Type   : " + vehicle.getType());
			System.out.println("Assigned Slot  : " + slot.getSlotId());
			System.out.println("Duration       : " + parkingHours + " hours");

			double charges = vehicle.calculateCharges(parkingHours);
			System.out.println(" Parking Fee  : Rs" + df.format(charges));

			slot.releaseSlot();
		} else {
			System.out.println(" No slot available for " + vehicle.getType());
		}

		system.printAvailability();
		printFooter();
	}


	static void printHeader() {
		System.out.println("========================================");
		System.out.println("             ParkEase System");
		System.out.println("      Smart Parking Management");
		System.out.println("========================================\n");
	}

	static void printFooter() {
		System.out.println("\n========================================");
		System.out.println("Thank you for using ParkEase ");
		System.out.println("Park smart. Drive easy.");
		System.out.println("========================================");
	}
}
