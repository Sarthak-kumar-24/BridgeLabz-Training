package com.addressbooksystem;

/**
 * Contact class represents a person in the Address Book.
 *
 * Demonstrates: - Encapsulation - Constructors - Composition (has an Address)
 */
public class Contact {

	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Address address;

	// Constructor
	public Contact(String firstName, String lastName, String phone, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	// Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}

	// Setter for editing
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Full name helper
	public String getFullName() {
		return firstName + " " + lastName;
	}

	@Override
	public String toString() {
		return getFullName() + " | Phone: " + phone + " | Email: " + email + " | Address: " + address;
	}

}
