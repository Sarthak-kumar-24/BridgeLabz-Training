package com.loanbuddy;

import java.text.DecimalFormat;


/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public class Applicant {

	private String name;
	private int creditScore;
	private double income;
	private double loanAmount;

	public Applicant(String name, int creditScore, double income, double loanAmount) {
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;

	}

	public String getName() {
		return name;

	}

	static DecimalFormat df = new DecimalFormat("0.00");

	public double getIncome() {
		return loanAmount;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	protected int getCreditScore() {
		return creditScore;
	}

	static void printHeader() {
		System.out.println("====================================================");
		System.out.println("               LoanBuddy Engine   ");
		System.out.println("        Smart Loan Approval Automation");
		System.out.println("====================================================\n");
	}

	static void printApplicantDetails(Applicant a) {
		System.out.println(" Applicant Details");
		System.out.println("----------------------------------------------------");
		System.out.println("Name            : " + a.getName());
		System.out.println("Monthly Income  : Rs" + a.getIncome());
		System.out.println("Requested Loan  : Rs" + a.getLoanAmount() + "\n");
	}

	static void printLoanDetails(LoanApplication l) {
		System.out.println(" Loan Details");
		System.out.println("----------------------------------------------------");
		System.out.println("Loan Type       : " + l.getLoanType());
		System.out.println("Loan Tenure     : " + l.getTerm() + " months");
		System.out.println("Interest Rate   : " + l.getInterestRate() + " %\n");
	}

	static void printEligibility(Applicant a, boolean approved) {
		System.out.println(" Eligibility Check");
		System.out.println("----------------------------------------------------");
		System.out.println(" Credit Score Check : " + (a.getCreditScore() >= 700 ? "PASSED" : "FAILED"));
		System.out.println(" Income Threshold  : " + (a.getIncome() >= 40000 ? "PASSED" : "FAILED"));
		System.out.println();
	}

	static void printApproval(Loan loan) {
		System.out.println(" Loan Status");
		System.out.println("----------------------------------------------------");
		System.out.println("Status          : APPROVED\n");

		System.out.println(" EMI Breakdown");
		System.out.println("----------------------------------------------------");
		System.out.println("Monthly EMI     : Rs" + df.format(loan.calculateEMI()));
		System.out.println("Total Tenure    : " + loan.loanApplication.getTerm() / 12 + " Years\n");
	}

	static void printRejection() {
		System.out.println(" Loan Status");
		System.out.println("----------------------------------------------------");
		System.out.println("Status          : REJECTED\n");
		System.out.println(" Reason");
		System.out.println("----------------------------------------------------");
		System.out.println("• Eligibility criteria not met\n");
	}

	static void printFooter() {
		System.out.println("====================================================");
		System.out.println("Thank you for choosing LoanBuddy ");
		System.out.println("Your financial goals, simplified.");
		System.out.println("====================================================");
	}

	public static void main(String[] args) {

		Applicant applicant = new Applicant("Rahul", 720, 55000, 800000);

		LoanApplication homeloan = new LoanApplication("Home Loan", 240, 8.5);
		LoanApplication autoloan = new LoanApplication("Auto Loan", 140, 6.5);

		Loan loan1 = new HomeLoan(applicant, homeloan);
		Loan loan2 = new AutoLoan(applicant, autoloan);

		printHeader();
		printApplicantDetails(applicant);
		printLoanDetails(homeloan);
		printLoanDetails(autoloan);

		boolean approved = loan1.approveLoan();
		printEligibility(applicant, approved);

		boolean approve = loan2.approveLoan();
		printEligibility(applicant, approve);

		if (approved) {
			printApproval(loan1);
		} else {
			printRejection();
		}
		if (approve) {
			printApproval(loan2);
		} else {
			printRejection();
		}

		printFooter();

	}

}
