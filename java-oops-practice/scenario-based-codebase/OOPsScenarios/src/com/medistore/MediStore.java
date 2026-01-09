package com.medistore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/* MediStore – Pharmacy Inventory & Sales System
 * 
 *  A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
 *  
 *  Medicine class: name, price, expiryDate, quantity.
 *  Constructors for medicines with default quantity.
 *  Use operators: total price, discount, stock adjustments.
 *  Inheritance: Tablet, Syrup, Injection extend Medicine.
 *  Polymorphism: checkExpiry() works differently for preserved vs liquid meds
 *  
 */
public class MediStore {

	List<Medicine> medicines = new ArrayList<>();
	
	private Scanner sc = new Scanner(System.in);

	void addMedicine(Medicine medicine) {
		medicines.add(medicine);
	}

	public void totalPrice(Medicine medicine, int qty) {

		int total = medicine.getPrice() * qty;

		System.out.println("Totoal Price: Rs" + total);

	}
	
	
    private void run() {
        printHeader();

        while (true) {
            printMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> displayMedicines();
                case 2 -> sellMedicine();
                case 3 -> {
                    footer();
                    return;
                }
                default -> System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    // ----------------- DATA -----------------
    private void seedData() {
        medicines.add(new Tablet("TabletA", 200, 10, 15, false));
        medicines.add(new Tablet("TabletB", 600, 10, 5, true));
        medicines.add(new Syrup("SyrupA", 250, 10, 10, false));
        medicines.add(new Injection("InjectionA", 500, 10, 3, false));
    }

    // ----------------- FEATURES -----------------
    private void displayMedicines() {
        printSection("AVAILABLE MEDICINES");

        System.out.printf("%-5s %-15s %-10s %-10s %-10s%n",
                "ID", "Name", "Price", "Stock", "Expired");

        for (int i = 0; i < medicines.size(); i++) {
            Medicine m = medicines.get(i);
            System.out.printf("%-5d %-15s %-10d %-10d %-10s%n",
                    i + 1,
                    m.getName(),
                    m.getPrice(),
                    m.getQuantity(),
                    m.checkExpiry() ? "YES" : "NO");
        }
    }

    private void sellMedicine() {
        displayMedicines();

        System.out.print("\nEnter Medicine ID to sell: ");
        int id = sc.nextInt() - 1;

        if (id < 0 || id >= medicines.size()) {
            System.out.println(" Invalid Medicine ID");
            return;
        }

        Medicine selected = medicines.get(id);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        selected.sell(qty);
        printBill(selected, qty);
    }

    private void printBill(Medicine m, int qty) {
        if (qty <= 0 || m.checkExpiry()) return;

        int total = m.getPrice() * qty;

        printSection("BILL SUMMARY");
        System.out.println(" Medicine   : " + m.getName());
        System.out.println(" Quantity   : " + qty);
        System.out.println(" Unit Price : Rs " + m.getPrice());
        System.out.println(" Total Bill : Rs " + total);
    }


    // ----------------- UI -----------------
    private static void printHeader() {
        System.out.println("=============================================");
        System.out.println("          MediStore Pharmacy System");
        System.out.println("      Inventory & Sales Management");
        System.out.println("=============================================");
    }

    private static void printMenu() {
        System.out.println("\n1. View Medicines");
        System.out.println("2. Sell Medicine");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
    }

    private static void printSection(String title) {
        System.out.println("\n---------------------------------------------");
        System.out.println(" " + title);
        System.out.println("---------------------------------------------");
    }

    private static void footer() {
        System.out.println("\n=============================================");
        System.out.println(" Thank you for using MediStore ");
        System.out.println(" Stay healthy. Stay stocked.");
        System.out.println("=============================================");
    }

    public static void main(String[] args) {
    	
        MediStore store = new MediStore();
        store.seedData();
        store.run();
    

	}
}
