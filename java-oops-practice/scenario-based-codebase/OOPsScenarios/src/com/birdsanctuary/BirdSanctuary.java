package com.birdsanctuary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* =======================================================
 * Main Class: BirdSanctuary
 * 
 * Acts as the controller for the sanctuary system
 * Manages bird records
 * Provides menu-driven CLI for operations
 * 
 * =======================================================
 */
public class BirdSanctuary {
	
    private static List<Bird> birds = new ArrayList<>();

    private static void addBird(Scanner sc) {
        System.out.println("Select Bird Type:");
        System.out.println("1. Eagle  2. Sparrow  3. Duck  4. Penguin  5. Ostrich");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bird ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bird Name: ");
        String name = sc.nextLine();

        Bird bird = null;
        switch (type) {
            case 1: bird = new Eagle(id, name); break;
            case 2: bird = new Sparrow(id, name); break;
            case 3: bird = new Duck(id, name); break;
            case 4: bird = new Penguin(id, name); break;
            case 5: bird = new Ostrich(id, name); break;
        }

        if (bird != null) {
            birds.add(bird);
            System.out.println("✅ Bird added successfully");
        }
    }

    private static void displayAll() {
        if (birds.isEmpty()) {
            System.out.println("No birds in sanctuary");
            return;
        }
        for (Bird b : birds) b.showInfo();
    }

    private static void displayFlyable() {
        for (Bird b : birds)
            if (b instanceof Flyable)
                b.showInfo();
    }

    private static void displaySwimmable() {
        for (Bird b : birds)
            if (b instanceof Swimmable)
                b.showInfo();
    }

    private static void displayBoth() {
        for (Bird b : birds)
            if (b instanceof Flyable && b instanceof Swimmable)
                b.showInfo();
    }

    private static void deleteById(Scanner sc) {
        System.out.print("Enter Bird ID to delete: ");
        int id = sc.nextInt();
        birds.removeIf(b -> b.getId() == id);
        System.out.println(" Bird removed if existed");
    }

    private static void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("\n Sanctuary Report");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======  EcoWing Bird Sanctuary ======");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: addBird(sc); break;
                case 2: displayAll(); break;
                case 3: displayFlyable(); break;
                case 4: displaySwimmable(); break;
                case 5: displayBoth(); break;
                case 6: deleteById(sc); break;
                case 7: report(); break;
                case 8:
                    System.out.println(" Exiting Sanctuary System");
                    sc.close();
                    return;
                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
