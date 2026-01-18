package com.insurancepolicymanagementsystemusingmap;

import java.time.LocalDate;

/*
 * InsurancePolicy class
 * Stores policy details
 */
public class InsurancePolicy {

	int policyNumber;
	String policyHolderName;
	LocalDate expiryDate;
	String coverageType;
	double premiumAmount;

	public InsurancePolicy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}
	
    @Override
    public String toString() {
        return "Policy No: " + policyNumber +
                ", Name: " + policyHolderName +
                ", Expiry: " + expiryDate +
                ", Coverage: " + coverageType +
                ", Premium: ₹" + premiumAmount;
    }
}
