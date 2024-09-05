package coding;

import java.util.Scanner;

public class ABC_Pyramid {

	public static void main(String[] args) {

		char c = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {

				System.out.print(c);
				if(c=='Y') {
					System.out.print('Z');
				}
				c++;
			}
			System.out.println();

		}
	}

}
