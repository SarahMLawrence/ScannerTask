package com.qa.scannertask;

//-------//
//IMPORTS//
//-------//
import java.util.Scanner;

public class Runner {

	// --------------//
	// DECLARATIONS //
	// --------------//
	public static Scanner scanner = new Scanner(System.in);

	// -------------//
	// MAIN METHOD //
	// -------------//
	public static void main(String[] args) {
		System.out.println("*****Welcome to Math Choice*****");

		int result = 0;
		boolean flag = true;

		do {
			System.out.println("\nPlease Make Your Choice: " + "\n1. Addition" + "\n2: Subtraction" + "\n3. Multiply"
					+ "\n4. Divide");

			result = scanner.nextInt();
			int x, y;
			switch (result) {
			case 1:
				System.out.println(" You choose ADDITION!");
				System.out.println("Enter 1st number: ");
				x = scanner.nextInt();
				System.out.print("Enter 2nd number: ");
				y = scanner.nextInt();
				System.out.print("\nAnswer: " + addOption(x, y) + "\n\n");
				break;
			case 2:
				System.out.println(" You choose SUBTRACTION!");
				System.out.println("Enter 1st number: ");
				x = scanner.nextInt();
				System.out.print("Enter 2nd number: ");
				y = scanner.nextInt();
				System.out.println("\nAnswer: " + subOption(x, y) + "\n\n");
				break;
			case 3:
				System.out.println(" You choose MULTIPLICATION!");
				System.out.println("Enter 1st number: ");
				x = scanner.nextInt();
				System.out.print("Enter 2nd number: ");
				y = scanner.nextInt();
				System.out.println("\nAnswer: " + multOption(x, y) + "\n\n");
				break;

			case 4:
				try {
					System.out.println(" You choose DIVISON!");
					System.out.println("Enter 1st number: ");
					x = scanner.nextInt();
					System.out.print("Enter 2nd number: ");
					y = scanner.nextInt();

					System.out.println("\nAnswer: " + divOption(x, y) + "\n\n");
				} catch (ArithmeticException e) {
					System.out.println("Cannot Divide by 0");
				}
				break;

			case 0:
				System.out.println("Thank you for using the Math Class! Goodbye!");
				flag = false;
				break;
			default:

				System.out.println("The number you entered is not one of the choices!");
				flag = false;
				break;
			}
		} while (flag);

		scanner.close();

	}

	// ------------//
	// ADD METHOD //
	// ------------//
	public static int addOption(int num1, int num2) {
		return num1 + num2;
	}

	// -----------------//
	// SUBTRACT METHOD //
	// -----------------//
	public static int subOption(int num1, int num2) {
		return num1 - num2;
	}

	// -----------------//
	// MULTIPLY METHOD //
	// -----------------//
	public static int multOption(int num1, int num2) {
		return num1 * num2;
	}

	// ---------------//
	// DIVIDE METHOD //
	// ---------------//
	public static int divOption(int num1, int num2) {

		return num1 / num2;

	}
}
