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
public class Transaction {
	
    double amount;
    String type; 
    String date;
    String category;

    Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

}
