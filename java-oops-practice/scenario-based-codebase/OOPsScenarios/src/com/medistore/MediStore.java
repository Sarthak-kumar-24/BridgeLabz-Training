package com.medistore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

	void addMedicine(Medicine medicine) {
		medicines.add(medicine);
	}

	public void totalPrice(Medicine medicine, int qty) {

		int total = medicine.getPrice() * qty;

		System.out.println("Totoal Price: Rs" + total);

	}

	private static void printHeader() {
		System.out.println("=================================================");
		System.out.println("             MediStore Pharmacy ");
		System.out.println("        Inventory & Sales Management");
		System.out.println("=================================================\n");
	}

	private static void printSection(String title) {
		System.out.println("\n-------------------------------------------------");
		System.out.println(" " + title);
		System.out.println("-------------------------------------------------");
	}

	public static void footer() {
		System.out.println("\n=================================================");
		System.out.println("Thank you for using MediStore ");
		System.out.println("Stay healthy. Stay stocked.");
		System.out.println("=================================================");
	}

	public static void main(String[] args) {
		

		MediStore store = new MediStore();
		printHeader();

		Medicine[] tablets = { new Tablet("TabletA", 200, 10, 15, false), 
				               new Tablet("TabletB", 600, 10, 5, true),
				               new Tablet("TabletC", 500, 10, 5, false), 
				               new Tablet("TabletD", 300, 10, 11, false)

		};
		Medicine[] syrups = { new Syrup("SyrupA", 200, 10, 10 , true), 
				             new Syrup("SyrupB", 250, 10, 5, false),
				             new Syrup("SyrupC", 300, 10, 50, false), 
				             new Syrup("SyrupD", 400, 10, 4, false)

		};

		Medicine[] injections = { new Injection("InjectionA", 300, 10, 15, false), 
				                  new Injection("InjectionB", 500, 10, 5, false),
				                  new Injection("InjectionC", 400, 10, 5, false), 
				                  new Injection("InjectionD", 1200, 10, 1, false)

		};

		printSection("ADDING MEDICINES TO INVENTORY");

		for (Medicine m : tablets)
			store.addMedicine(m);
		for (Medicine m : syrups)
			store.addMedicine(m);
		for (Medicine m : injections)
			store.addMedicine(m);

		System.out.println(" Tablets added    : " + tablets.length);
		System.out.println(" Syrups added     : " + syrups.length);
		System.out.println(" Injections added : " + injections.length);

		printSection("SALE TRANSACTION");

		Medicine selected = tablets[0];
		selected.sell(3);
		store.totalPrice(selected, 3);
		
		Medicine syrupselected = syrups[0];
		syrupselected.sell(3);
		store.totalPrice(syrupselected, 3);
		
		Medicine injectionselected = injections[0];
		injectionselected.sell(3);
		store.totalPrice(injectionselected, 3);

		footer();

	}
}
