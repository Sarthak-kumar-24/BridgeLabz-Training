package com.payxpress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * PayXpress – Utility Bill Payment System
 * 
 * 
 * Bill class: type, amount, dueDate, isPaid.
 * Interface IPayable with pay() and sendReminder().
 * Use constructors to create recurring bills.
 * Encapsulation: prevent direct payment status changes.
 * Inheritance: ElectricityBill, InternetBill, WaterBill.
 * Polymorphism: reminders vary depending on utility type.
 */
public class PayXpress {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bill> bills = new ArrayList<>();

        while (true) {
            System.out.println("\n======  PAYXPRESS MENU ======");
            System.out.println("1. Add Bill");
            System.out.println("2. Pay Bill");
            System.out.println("3. Send Reminders");
            System.out.println("4. View Bills");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Select Bill Type: 1.Electricity 2.Internet 3.Water");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Due Date: ");
                    String due = sc.nextLine();

                    Bill bill = null;
                    if (type == 1) bill = new ElectricityBill(amt, due);
                    else if (type == 2) bill = new InternetBill(amt, due);
                    else if (type == 3) bill = new WaterBill(amt, due);

                    if (bill != null) {
                        bills.add(bill);
                        System.out.println(" Bill added");
                    }
                    break;

                case 2:
                    System.out.print("Enter bill index to pay: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < bills.size()) {
                        bills.get(idx).pay();
                    } else {
                        System.out.println(" Invalid bill index");
                    }
                    break;

                case 3:
                    for (Bill b : bills)
                        if (!b.isPaid())
                            b.sendReminder();
                    break;

                case 4:
                    for (int i = 0; i < bills.size(); i++) {
                        System.out.print(i + ". ");
                        bills.get(i).showBill();
                    }
                    break;

                case 5:
                    System.out.println(" Exiting PayXpress");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
