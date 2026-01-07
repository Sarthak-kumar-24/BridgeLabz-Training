package com.loanbuddy;


/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public class LoanApplication {

	
	private String loanType;
	private int term; // in months
	private double interestRate;

	public LoanApplication(String loanType, int term, double interestRate) {
		this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;

	}

	public int getTerm() {
		return term;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public String getLoanType() {
		return loanType;
	}

}
