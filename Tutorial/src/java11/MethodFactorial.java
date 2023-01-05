package java11;

import java.util.Scanner;

public class MethodFactorial {

	public static void factorial(int num) {

		if (num < 0) {
			System.out.println("Invalid number.");
			return;
		}

		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;

		}

		System.out.println("The factorial of your number is: " + fact);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print the number to calculate the factorial: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		factorial(num);

	}

}
