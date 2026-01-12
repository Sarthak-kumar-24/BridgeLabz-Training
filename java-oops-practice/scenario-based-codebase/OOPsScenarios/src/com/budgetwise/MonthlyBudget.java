package com.budgetwise;

import java.util.HashMap;
import java.util.Map;

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
public class MonthlyBudget extends Budget{
	
    public MonthlyBudget(double income, Map<String, Double> limits) {
        super(income);
        this.categoryLimits.putAll(limits);
    }

    public void generateReport() {
        System.out.println("\n Monthly Budget Report");
        for (Transaction t : transactions) {
            System.out.println(t.date + " | " + t.category + " | " + t.amount);
        }
        System.out.println(" Savings: " + getSavings());
    }

    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.type.equals("EXPENSE")) {
                spent.put(t.category,
                        spent.getOrDefault(t.category, 0.0) + t.amount);
            }
        }

        for (String cat : spent.keySet()) {
            if (spent.get(cat) > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
                System.out.println(" Overspent in " + cat);
            }
        }
    }

}
