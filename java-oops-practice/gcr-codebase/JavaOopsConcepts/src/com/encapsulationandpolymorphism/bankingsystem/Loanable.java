package com.encapsulationandpolymorphism.bankingsystem;

/* Banking System
 * 
 * Description: Create a banking system with different account types:
 * 
 * Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
 * Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
 * Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
 * Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
 * Use encapsulation to secure account details and restrict unauthorized access.
 * Demonstrate polymorphism by processing different account types and calculating interest dynamically.

 */
public interface Loanable {

    void applyForLoan();
    double calculateLoanEligibility();
}
