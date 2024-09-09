package coding;

import java.util.Scanner;

public class PalindromePyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int a = sc.nextInt();

		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
