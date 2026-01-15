package com.zipzipmart;

public class Transaction {
	
    protected int id;
    protected String date; // YYYY-MM-DD format
    protected int amount;

    
    public Transaction(int id, String date, int amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

}
