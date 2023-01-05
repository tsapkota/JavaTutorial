package java11;

import java.util.Scanner;

public class MethodSum {

	public static int sumTwoNumbers(int x, int y) {
		int z = x + y;
		
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the first number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Print the Second number: ");
		int y = sc.nextInt();

		int sum = sumTwoNumbers(x, y);
		
		System.out.println("Sum of two numbers is " + sum);

	}

}
