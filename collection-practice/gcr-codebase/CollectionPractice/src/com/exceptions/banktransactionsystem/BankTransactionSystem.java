package com.exceptions.banktransactionsystem;

public class BankTransactionSystem {
	
    public static void main(String[] args) {

        // Creating bank account with initial balance
        BankAccount account = new BankAccount(5000);

        try {
            // Trying to withdraw amount
            account.withdraw(6000);

        } catch (InsufficientBalanceException e) {
            // Handles custom checked exception
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            // Handles negative amount case
            System.out.println(e.getMessage());
        }
    }

}
