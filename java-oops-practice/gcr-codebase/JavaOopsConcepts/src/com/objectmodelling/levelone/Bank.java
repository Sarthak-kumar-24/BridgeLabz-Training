package com.objectmodelling.levelone;

public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Bank communicates with Customer
    public void openAccount(Customer customer, double initialBalance) {
        System.out.println(" Account opened for " + customer.getName() + " at " + bankName + " with balance Rs" + initialBalance);

        customer.setBalance(initialBalance);
    }

    public String getBankName() {
        return bankName;
    }
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer ramesh = new Customer("Ramesh");

        sbi.openAccount(ramesh, 5000);
        ramesh.viewBalance(sbi);

        hdfc.openAccount(ramesh, 10000);
        ramesh.viewBalance(hdfc);
    }
}
