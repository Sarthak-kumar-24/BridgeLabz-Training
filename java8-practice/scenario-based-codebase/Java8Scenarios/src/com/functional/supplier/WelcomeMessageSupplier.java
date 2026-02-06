package com.functional.supplier;

import java.util.function.Supplier;

/*
 * WelcomeMessageSupplier
 * --------------------------
 * Uses Supplier to provide a default welcome message.
 */
public class WelcomeMessageSupplier {

	   public static void main(String[] args) {

	        Supplier<String> welcomeMsg =
	                () -> " Welcome to the platform — let’s build something cool!";

	        System.out.println("For Sarthak -> " + welcomeMsg.get());
	        System.out.println("For Devijii -> " + welcomeMsg.get());
	    }
}
