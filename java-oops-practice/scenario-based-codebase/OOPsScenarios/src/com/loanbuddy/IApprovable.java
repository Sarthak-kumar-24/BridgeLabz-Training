package com.loanbuddy;


/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public interface IApprovable {
	
	boolean approveLoan();
	double calculateEMI();	

}
