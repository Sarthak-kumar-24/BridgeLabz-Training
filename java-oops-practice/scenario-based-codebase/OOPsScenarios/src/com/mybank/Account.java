package com.mybank;

/* MyBank – Managing Customer Accounts
 * 
 * 
 * Account (base class): fields like accountNumber, balance.
 * Derived classes: SavingsAccount, CurrentAccount (using inheritance).
 * ITransaction interface: deposit(), withdraw(), checkBalance().
 * Use constructors for account initialization with or without an opening balance.
 * Encapsulation: balance must be private and only modifiable through methods.
 * Use operators for interest: balance * interestRate / 100.
 * Polymorphism in calculateInterest() – varies by account type.
 * 
 * Use access modifiers: protect account data, expose only required operations.
 */
public abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance;   // encapsulated

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; 
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println(" Insufficient balance");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
    private static void printHeader(String title) {
        System.out.println("\n=================================");
        System.out.println(" " + title);
        System.out.println("=================================");
    }

    private static void printAccountSummary(Account account) {
        System.out.println("Account Number : " + account.accountNumber);
        System.out.println("Account Type   : " + account.getClass().getSimpleName());
        System.out.println("Balance        : Rs " + account.checkBalance());
        System.out.println("Interest       : Rs " + account.calculateInterest());
        System.out.println("---------------------------------");
    }

    
    public abstract double calculateInterest();
    
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("SB1001", 10000);
        Account acc2 = new CurrentAccount("CA2001");

        printHeader("INITIAL ACCOUNT DETAILS");
        printAccountSummary(acc1);
        printAccountSummary(acc2);

        printHeader("PERFORMING TRANSACTIONS");

        acc1.deposit(5000);
        System.out.println("Deposited Rs 5000 into Account " + acc1.accountNumber);

        acc2.deposit(8000);
        System.out.println("Deposited Rs 8000 into Account " + acc2.accountNumber);

        acc1.withdraw(2000);
        System.out.println("Withdrawn Rs 2000 from Account " + acc1.accountNumber);

        printHeader("FINAL ACCOUNT SUMMARY");
        printAccountSummary(acc1);
        printAccountSummary(acc2);
    }
}

