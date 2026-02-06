package com.functional.supplier;

import java.util.Random;
import java.util.function.Supplier;

/*
 * OtpSupplier
 * ---------------
 * Demonstrates use of Supplier functional interface.
 * Generates a random 6-digit OTP.
 */
public class OtpSupplier {

	public static void main(String[] args) {

		Supplier<Integer> otpSupplier = () -> 100000 + new Random().nextInt(900000);

		System.out.println(" OTP for Sarthak: " + otpSupplier.get());
		System.out.println(" OTP for Nishita: " + otpSupplier.get());
	}

}
