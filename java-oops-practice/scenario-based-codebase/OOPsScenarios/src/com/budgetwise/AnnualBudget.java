package com.budgetwise;

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
public class AnnualBudget extends Budget{
	
    public AnnualBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("\n Annual Budget Summary");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + getSavings());
    }

    public void detectOverspend() {
        if (getTotalExpenses() > income)
            System.out.println(" Annual overspending detected");
        else
            System.out.println(" Spending within annual income");
    }

}
