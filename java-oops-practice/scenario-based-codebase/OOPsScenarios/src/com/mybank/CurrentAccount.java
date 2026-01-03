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
public class CurrentAccount extends Account {
    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}

