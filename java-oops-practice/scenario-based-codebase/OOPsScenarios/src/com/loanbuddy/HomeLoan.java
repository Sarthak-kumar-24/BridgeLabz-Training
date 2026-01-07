package com.loanbuddy;


/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible = applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return standardEMI(
                applicant.getLoanAmount(),
                loanApplication.getInterestRate(),
                loanApplication.getTerm()
        );
    }
}

