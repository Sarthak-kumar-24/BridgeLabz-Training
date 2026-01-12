package com.budgetwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public abstract class Budget implements IAnalyzable {
	
    protected double income;
    protected List<Transaction> transactions = new ArrayList<>();
    protected Map<String, Double> categoryLimits = new HashMap<>();

    public Budget(double income) {
        this.income = income;
    }

 
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.type.equals("EXPENSE"))
                total += t.amount;
        }
        return total;
    }

    public double getSavings() {
        return income - getTotalExpenses(); 
    }

}
