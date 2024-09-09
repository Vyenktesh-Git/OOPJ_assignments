package CompoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculatorUtilClass {

	private CompoundInterestCalculator compoundCalculator;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the Number of Times Interest is Compounded per Year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter the Investment Duration: ");
        int years = scanner.nextInt();
        compoundCalculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    public void printRecord() {
        if (compoundCalculator != null) {
            System.out.println(compoundCalculator.toString());
        } else {
            System.out.println("No investment details available.");
        }
    }

    public void menuList() {
        System.out.println("1. Accept Investment Details");
        System.out.println("2. Display Investment Details");
        
        
    }
}
