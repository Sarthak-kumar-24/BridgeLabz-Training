package com.ewalletapplication;

/* E-Wallet Application
 * 
 * Scenario: Users can register, load money, transfer funds, and view transaction history.
 * 
 * Class: User, Wallet, Transaction
 * Constructors: Initialize wallets with optional referral bonus
 * Access Modifiers: Make balance private, expose via getBalance()
 * Encapsulation: Prevent direct manipulation of balance
 * Abstraction: Expose only essential transaction methods
 * Polymorphism: Same transferTo() method but different business logic
 * Inheritance: PersonalWallet, BusinessWallet with different limits
 * 
 */
public class User {
    private int userId;
    protected String name;
    private Wallet wallet;

    public User(int userId, String name, Wallet wallet) {
        this.userId = userId;
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }
    
  
    
    public static void main(String[] args) {

        
    	
        Wallet personalWallet = new PersonalWallet(130000); 
        Wallet businessWallet = new BusinessWallet(800000);

        
        User u1 = new User(1, "Sarthak", personalWallet);
        User u2 = new User(2, "DeviJii", businessWallet);

        
        System.out.println("INITIAL BALANCES");
        System.out.println("---------------------------------");
        System.out.println(u1.getName() + " Balance : Rs " + u1.getWallet().getBalance());
        System.out.println(u2.getName() + " Balance : Rs " +u2.getWallet().getBalance());

       
        System.out.println("\nTRANSFERRING MONEY");
        System.out.println("---------------------------------");
        u1.getWallet().transferTo(u2, 50000);

        //Displays updated balances
        System.out.println("\nUPDATED BALANCES");
        System.out.println("---------------------------------");
        System.out.println(u1.getName() + " Balance : Rs " + u1.getWallet().getBalance());
        System.out.println(u2.getName() + " Balance : Rs " + u2.getWallet().getBalance());

        // Shows transaction history
        System.out.println("\nTRANSACTION HISTORY (" + u1.getName() + ")");
        System.out.println("----------------------------------");
        u1.getWallet().showTransactions();

       
        System.out.println("\nBUSINESS WALLET TRANSFER");
        System.out.println("---------------------------------");
        u2.getWallet().transferTo(u1, 110000);

        //Final balances
        System.out.println("\nFINAL BALANCES");
        System.out.println("---------------------------------");
        System.out.println(u1.getName() + " Balance : Rs " + u1.getWallet().getBalance());
        System.out.println(u2.getName() + " Balance : Rs " + u2.getWallet().getBalance());

        //Shows both transaction histories
        System.out.println("\nFINAL TRANSACTION HISTORY");
        System.out.println("---------------------------------");
        System.out.println(u1.getName() + " Transactions:");
        u1.getWallet().showTransactions();

        System.out.println("\n" + u2.getName() + " Transactions:");
        u2.getWallet().showTransactions();
    }
}

