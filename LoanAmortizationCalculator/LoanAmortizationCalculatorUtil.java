package LoanAmortizationCalculator;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {

	private LoanAmortizationCalculator loanCalculator;

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Principal Amount (in ₹): ");
		double principal = scanner.nextDouble();

		System.out.print("Enter the Annual Interest Rate (in %): ");
		double annualInterestRate = scanner.nextDouble();

		System.out.print("Enter the Loan Term (in years): ");
		int loanTerm = scanner.nextInt();

		loanCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
	}

	public void printRecord() {
		if (loanCalculator != null) {
			System.out.println(loanCalculator.toString());
		} else {
			System.out.println("No loan details available.");
		}
	}

	public void menuList() {
		System.out.println("1. Accept Loan Details");
		System.out.println("2. Display Loan Details");
	}
}
