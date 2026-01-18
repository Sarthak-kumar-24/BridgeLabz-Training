package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

/*
 * Insurance Policy class
 * Implements Comparable to allow TreeSet sorting by expiry date
 */
public class InsurancePolicy implements Comparable<InsurancePolicy> {

	private int policyNumber;
	private String policyHolderName;
	private LocalDate expiryDate;
	private String coverageType;
	private double premiumAmount;

	public InsurancePolicy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	// Getters
	public int getPolicyNumber() {
		return policyNumber;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InsurancePolicy))
			return false;
		InsurancePolicy other = (InsurancePolicy) obj;
		return this.policyNumber == other.policyNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(policyNumber);
	}

	// Sort policies by expiry date
	@Override
	public int compareTo(InsurancePolicy other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}

	// Display format
	@Override
	public String toString() {
		return "Policy No: " + policyNumber + ", Name: " + policyHolderName + ", Expiry: " + expiryDate + ", Coverage: "
				+ coverageType + ", Premium: Rs" + premiumAmount;
	}
}
