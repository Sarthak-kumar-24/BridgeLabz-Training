package com.streamAPI.filteringexpiringmemberships;

import java.time.LocalDate;

/*
 * GymMember
 * ---------
 * Represents a gym member with
 * name and membership expiry date.
 */
public class GymMember {

	private String name;
	private LocalDate expiryDate;

	public GymMember(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return name + " | Expiry Date: " + expiryDate;
	}
}
