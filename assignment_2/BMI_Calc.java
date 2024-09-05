package assignment_2;

import java.util.Scanner;

public class BMI_Calc {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Enter height in cms: ");
		float height = sc.nextFloat();
		System.out.println();
		System.out.print("Enter weight in kg: ");
		float weight = sc.nextFloat();
		
		height = height/100;
		
		float bmi = weight /(height*height);
		
		if(bmi < 19) {
			System.out.println("underweight");
		}
		else if (bmi > 19 && bmi < 25) {
			System.out.println("normal");
		}
		else if (bmi > 25 && bmi < 30) {
			System.out.println("overweight");
		}
		else {
			System.out.println("obese");
		}
	}
}
