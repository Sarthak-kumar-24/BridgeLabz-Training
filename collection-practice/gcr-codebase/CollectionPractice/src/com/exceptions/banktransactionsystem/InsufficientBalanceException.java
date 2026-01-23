package com.exceptions.banktransactionsystem;

public class InsufficientBalanceException extends Exception{
	
    // Constructor with custom message
    public InsufficientBalanceException(String message) {
        super(message);
    }

}
