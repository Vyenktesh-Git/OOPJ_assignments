package coding;

public class HollowInvertedPyramid {

	public static void main(String[] args) {

		for (int i = 6; i > 0; i--) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				if (i == 1 || i == 6 || k == 1 || k == (2 * i) - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}

			}
			System.out.println();
		}
	}
}
