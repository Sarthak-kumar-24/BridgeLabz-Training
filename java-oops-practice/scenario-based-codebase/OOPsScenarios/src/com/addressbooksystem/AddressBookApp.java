package com.addressbooksystem;

import java.util.Scanner;

/**
 * AddressBookApp is the entry point of the application.
 *
 * Responsibilities: - Display menu - Take user input - Call AddressBook methods
 */
public class AddressBookApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AddressBook book = new AddressBook();

		while (true) {
			System.out.println("\n===== Address Book Menu =====");
			System.out.println("1. Add Contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search by City/State");
			System.out.println("5. Display All Contacts");
			System.out.println("6. Exit");

			System.out.print("Choose option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("First Name: ");
				String fn = sc.nextLine();
				System.out.print("Last Name: ");
				String ln = sc.nextLine();
				System.out.print("Phone: ");
				String phone = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("City: ");
				String city = sc.nextLine();
				System.out.print("State: ");
				String state = sc.nextLine();
				System.out.print("Zip: ");
				String zip = sc.nextLine();

				Address addr = new Address(city, state, zip);
				Contact contact = new Contact(fn, ln, phone, email, addr);
				book.addContact(contact);
				break;

			case 2:
				System.out.print("Enter full name to edit: ");
				String editName = sc.nextLine();
				System.out.print("New phone number: ");
				String newPhone = sc.nextLine();
				book.editContact(editName, newPhone);
				break;

			case 3:
				System.out.print("Enter full name to delete: ");
				String delName = sc.nextLine();
				book.deleteContact(delName);
				break;

			case 4:
				System.out.print("Enter city or state: ");
				String key = sc.nextLine();
				book.searchByCityOrState(key);
				break;

			case 5:
				book.displaySortedContacts();
				break;

			case 6:
				System.out.println(" Exiting Address Book. Bye!");
				sc.close();
				return;

			default:
				System.out.println(" Invalid choice.");
			}
		}
	}

}
