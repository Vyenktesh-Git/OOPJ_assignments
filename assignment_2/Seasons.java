package assignment_2;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month:");
		int month = sc.nextInt();
		
		switch (month) {
		case 11:
		case 12:
		case 1:
			System.out.println("Winter");
			break;
			
		case 2:
		case 3:
		case 4:
			System.out.println("Spring");
			break;
		
		case 5:
		case 6:
		case 7:
			System.out.println("Summer");
			break;
			
		case 8:
		case 9:
		case 10:
			System.out.println("Autumn");
			break;	

		default:
			break;
		}
		
	}
}
