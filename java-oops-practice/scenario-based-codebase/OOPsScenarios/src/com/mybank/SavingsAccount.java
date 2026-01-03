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
public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100; // operator logic
    }
}
