package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

/* Banking System
 * 
 * Description: Create a banking system with different account types:
 * 
 * 
 * Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
 * Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
 * Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
 * Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
 * Use encapsulation to secure account details and restrict unauthorized access.
 * Demonstrate polymorphism by processing different account types and calculating interest dynamically.
 * 
 */
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive data (encapsulation)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Encapsulated access to borrower data
    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected void releaseItem() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    // Abstract behavior
    public abstract int getLoanDuration();
    
    public static void processItems(List<LibraryItem> items) {

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable r) {
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println("----------------------------------|");
        }
    }
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Clean Code", "Sss"));
        items.add(new Magazine(2, "Time", "Time Editors"));
        items.add(new DVD(3, "Inception", "RRR"));

        processItems(items);

        
        if (items.get(1) instanceof Reservable book) {
            book.reserveItem("Aman");
            book.reserveItem("n");
        }

    }
}

