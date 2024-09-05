package assignment_2;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a shape");
		String shape = sc.next();
		
		float area;
		
		switch (shape) {
		case "circle":
			System.out.println("Enter radius: ");
			float r = sc.nextFloat();
			area = (float) (3.14 * r * r);
			System.out.println("area: "+area);
			break;
			
		case "square":
			System.out.println("Enter side length: ");
			float side = sc.nextFloat();
			area = side * side;
			System.out.println("area: "+area);
			break;
			
		case "rectangle":
			System.out.println("Enter length: ");
			float l = sc.nextFloat();
			System.out.println("Enter breadth: ");
			float b = sc.nextFloat();
			area = l * b;
			System.out.println("area: "+area);
			break;
			
		case "triangle":
			System.out.println("Enter height: ");
			float h = sc.nextFloat();
			System.out.println("Enter base");
			float base = sc.nextFloat();
			area = (float) (0.5 * h * base);
			System.out.println("area: "+area);
			break;

		default:
			break;
		}
	}
}
