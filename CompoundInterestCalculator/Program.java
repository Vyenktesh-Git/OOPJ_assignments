package CompoundInterestCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        CompoundInterestCalculatorUtilClass util = new CompoundInterestCalculatorUtilClass();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            util.menuList();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    util.acceptRecord();
                    break;
                case 2:
                    util.printRecord();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
