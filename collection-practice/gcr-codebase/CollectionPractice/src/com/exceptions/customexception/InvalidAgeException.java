package com.exceptions.customexception;

//Step 1: Creating a custom exception class
//Extending Exception makes it a checked exception
public class InvalidAgeException extends Exception{
	
    public InvalidAgeException(String message) {
        super(message);
    }

}
