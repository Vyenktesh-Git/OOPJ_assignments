package CompoundInterestCalculator;

import java.text.DecimalFormat;

public class CompoundInterestCalculator {
	private double principal;
	private double annualInterestRate;
	private int numberOfCompounds;
	private int years;

	public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompounds, int years) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
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

	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double calculateFutureValue() {
		double futureValue = principal
				* Math.pow((1 + annualInterestRate / numberOfCompounds / 100), (numberOfCompounds * years));
		return futureValue;
	}

	public double calculateTotalInterest() {
		return calculateFutureValue() - principal;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return "Principal: ₹" + df.format(principal) + "\n" + "Annual Interest Rate: " + annualInterestRate + "%\n"
				+ "Number of Compounds per Year: " + numberOfCompounds + "\n" + "Investment Duration: " + years
				+ " years\n" + "Future Value: ₹" + df.format(calculateFutureValue()) + "\n" + "Total Interest Earned: ₹"
				+ df.format(calculateTotalInterest());
	}
}
