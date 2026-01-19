package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * AddressBook class manages a list of contacts.
 *
 * Responsibilities:
 * - Add contact
 * - Edit contact
 * - Delete contact
 * - Search contacts
 * - Display sorted contacts
 */
public class AddressBook {
	
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate check
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getPhone().equals(contact.getPhone())) {
                System.out.println(" Duplicate contact detected!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println(" Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String name, String newPhone) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                System.out.println(" Contact updated.");
                return;
            }
        }
        System.out.println(" Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println(" Contact deleted.");
                return;
            }
        }
        System.out.println(" Contact not found.");
    }

    // Search by city or state
    public void searchByCityOrState(String value) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found)
            System.out.println(" No contacts found.");
    }

    // Display sorted contacts
    public void displaySortedContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        System.out.println("\n Contact List (Sorted):");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

}
