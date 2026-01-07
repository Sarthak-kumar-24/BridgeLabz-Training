package com.parkease;

/*
 * ParkEase – Smart Parking Management System
 * 
 * A city wants a smart parking solution that can assign parking slots, calculate charges,
 * and track availability in real time.
 */
public class ParkingSlot {

	private String slotId;
	protected boolean isOccupied;
	private String vehicleTypeAllowed;
	private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

	public boolean assignVehicle(Vehicle vehicle) {
		if (!isOccupied && vehicle.getType().equals(vehicleTypeAllowed)) {
			parkedVehicle = vehicle;
			isOccupied = true;
			return true;
		}
		return false;
	}

	public String vehicleAllowed() {
		return vehicleTypeAllowed;
	}

	public void releaseSlot() {
		isOccupied = false;
		parkedVehicle = null;
	}

	public String getSlotId() {
		return slotId;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public String getVehicleTypeAllowed() {
		return vehicleTypeAllowed;
	}

}
