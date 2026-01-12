package com.budgetwise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * BudgetWise – Personal Finance Tracker
 * 
 * 
 * Transaction class: amount, type, date, category.
 * Budget class: income, limit, categoryLimits[].
 * Interface IAnalyzable with generateReport() and detectOverspend().
 * Constructors for monthly budgets with custom categories.
 * Inheritance: MonthlyBudget, AnnualBudget.
 * Polymorphism: report format varies (monthly vs yearly).
 * 
 */
public class BudgetWise {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Budget budget = null;

        while (true) {
            System.out.println("\n======  BUDGETWISE MENU ======");
            System.out.println("1. Create Monthly Budget");
            System.out.println("2. Create Annual Budget");
            System.out.println("3. Add Transaction");
            System.out.println("4. Generate Report");
            System.out.println("5. Detect Overspending");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Monthly Income: ");
                    double income = sc.nextDouble();
                    sc.nextLine();

                    Map<String, Double> limits = new HashMap<>();
                    System.out.print("Enter number of categories: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Category name: ");
                        String cat = sc.nextLine();
                        System.out.print("Limit: ");
                        double limit = sc.nextDouble();
                        sc.nextLine();
                        limits.put(cat, limit);
                    }

                    budget = new MonthlyBudget(income, limits);
                    System.out.println(" Monthly budget created");
                    break;

                case 2:
                    System.out.print("Enter Annual Income: ");
                    double aIncome = sc.nextDouble();
                    budget = new AnnualBudget(aIncome);
                    System.out.println(" Annual budget created");
                    break;

                case 3:
                    if (budget == null) {
                        System.out.println(" Create a budget first");
                        break;
                    }

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Type (INCOME/EXPENSE): ");
                    String type = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    budget.addTransaction(new Transaction(amt, type, date, cat));
                    System.out.println(" Transaction added");
                    break;

                case 4:
                    if (budget != null)
                        budget.generateReport();
                    break;

                case 5:
                    if (budget != null)
                        budget.detectOverspend();
                    break;

                case 6:
                    System.out.println(" Exiting BudgetWise");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice");
            }
        }
    }

}
