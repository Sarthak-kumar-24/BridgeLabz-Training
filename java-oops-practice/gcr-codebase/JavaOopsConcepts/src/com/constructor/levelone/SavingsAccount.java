package com.constructor.levelone;

/**
 * Sub-Class Name: SavingsAccount
 * Subclass of BankAccount.
 * Demonstrates access to public and protected members.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    /**
     * Parameterized constructor
     */
    public SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    /**
     * Displays savings account details
     * Accesses public and protected members
     */
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : ₹" + getBalance());   // private via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount(1234567890L, "Rohit Kumar", 25000);

        account.displayAccountDetails();
        System.out.println("----------------------------------");

        // Modifying balance using public methods
        account.deposit(5000);
        account.withdraw(3000);

        System.out.println("Updated Balance: ₹" + account.getBalance());
        System.out.println("----------------------------------");

        // Creating SavingsAccount object
        SavingsAccount savings = new SavingsAccount( 9876543210L,"Saurav Kumar", 40000, 4.5 );

        savings.displaySavingsAccountDetails();
    }

}
