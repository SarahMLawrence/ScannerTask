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
			System.out.println("Please Make Your Choice: " + "\n1. Addition" + "\n2: Subtraction" + "\n3. Multiply"
					+ "\n4. Divide");

			result = scanner.nextInt();
			switch (result) {
			case 1:
				System.out.println(addOption(10, 5));
				break;
			case 2:
				System.out.println(subOption(20, 2));
				break;
			case 3:
				System.out.println(multOption(4, 5));
				break;

			case 4:
				System.out.println(divOption(20, 10));
				break;

			case 0:
				System.out.println("exiting app");
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
