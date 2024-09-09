package LoanAmortizationCalculator;

import java.text.DecimalFormat;

public class LoanAmortizationCalculator {

	 private double principal;
	    private double annualInterestRate;
	    private int loanTerm;

	    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
	        this.principal = principal;
	        this.annualInterestRate = annualInterestRate;
	        this.loanTerm = loanTerm;
	    }

	    public double getPrincipal() {
	        return principal;
	    }

	    public void setPrincipal(double principal) {
	        this.principal = principal;
	    }

	    public double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }

	    public int getLoanTerm() {
	        return loanTerm;
	    }

	    public void setLoanTerm(int loanTerm) {
	        this.loanTerm = loanTerm;
	    }

	    public double calculateMonthlyPayment() {
	        double monthlyInterestRate = annualInterestRate / 12 / 100;
	        int numberOfMonths = loanTerm * 12;
	        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
	                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	        return monthlyPayment;
	    }

	    public double calculateTotalPayment() {
	        return calculateMonthlyPayment() * loanTerm * 12;
	    }

	    public String toString() {
	        DecimalFormat df = new DecimalFormat("#,###.00");
	        return "Principal: ₹" + df.format(principal) + "\n" +
	               "Annual Interest Rate: " + annualInterestRate + "%\n" +
	               "Loan Term: " + loanTerm + " years\n" +
	               "Monthly Payment: ₹" + df.format(calculateMonthlyPayment()) + "\n" +
	               "Total Payment: ₹" + df.format(calculateTotalPayment());
	    }
}
