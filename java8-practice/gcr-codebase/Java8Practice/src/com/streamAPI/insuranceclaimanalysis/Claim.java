package com.streamAPI.insuranceclaimanalysis;

/*
 * Claim
 * -----
 * Represents an insurance claim
 * with type and amount.
 */
public class Claim {

	private String claimType;
	private double amount;

	public Claim(String claimType, double amount) {
		this.claimType = claimType;
		this.amount = amount;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getAmount() {
		return amount;
	}
}
