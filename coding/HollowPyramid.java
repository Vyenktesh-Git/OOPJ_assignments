package coding;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the height of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

     
        for(int i=1;i<=height;i++) {
        	for(int j=1;j<=height-i;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=(2*i-1);k++) {
        		if(k==1 || k==(2*i-1) || i == height) {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
    }
}


