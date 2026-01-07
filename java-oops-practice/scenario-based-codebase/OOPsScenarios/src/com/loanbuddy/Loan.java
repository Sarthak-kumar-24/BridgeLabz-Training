package com.loanbuddy;


/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public abstract class Loan implements IApprovable {

    protected Applicant applicant;
    protected LoanApplication loanApplication;
    private boolean approved;   

    public Loan(Applicant applicant, LoanApplication loanApplication) {
        this.applicant = applicant;
        this.loanApplication = loanApplication;
    }

    protected void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }

    // Common EMI formula
    protected double standardEMI(double principal, double rate, int time) {
        double r = rate / (12 * 100);
        return (principal * r * Math.pow(1 + r, time)) /
               (Math.pow(1 + r, time) - 1);
    }
}

