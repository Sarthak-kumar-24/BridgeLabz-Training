package com.loanbuddy;

/*
 * LoanBuddy – Loan Approval Automation
 * 
 * LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
 * approve or reject the loan based on custom rules. 
 * It also calculates monthly EMIs and provides
 * a personalized repayment plan.
 */
public class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, LoanApplication loanApplication) {
        super(applicant, loanApplication);
    }

    @Override
    public boolean approveLoan() {
        boolean eligible =
                applicant.getCreditScore() >= 650 &&
                applicant.getIncome() >= 25000;

        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        // Auto loans usually shorter → higher EMI
        return standardEMI(
                applicant.getLoanAmount(),
                loanApplication.getInterestRate() + 0.5,
                loanApplication.getTerm()
        );
    }
}

