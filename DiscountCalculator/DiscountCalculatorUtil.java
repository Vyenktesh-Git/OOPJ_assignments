package DiscountCalculator;

import java.util.Scanner;

public class DiscountCalculatorUtil {

	public static DiscountCalculator acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name of the item: ");
		String name = sc.next();

		System.out.print("Enter the original price of the item: ");
		double originalPrice = sc.nextDouble();

		System.out.print("Enter the discount rate: ");
		double discountRate = sc.nextDouble();

		return new DiscountCalculator(name, originalPrice, discountRate);

	}

	public static void printRecord(DiscountCalculator discountCalculator) {
		System.out.println(discountCalculator);
	}

	public static void menu() {
		System.out.println("1. Accept Item Record");
		System.out.println("2. Display Item Record");
	}
}
