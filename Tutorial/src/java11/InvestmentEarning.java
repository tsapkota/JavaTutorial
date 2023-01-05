package java11;

import java.util.Scanner;

public class InvestmentEarning {

	public static void main(String[] args) {
		Scanner price = new Scanner(System.in);
		
		System.out.println("Enter the amount you invested in a share: ");
		
		double buyingPrice = price.nextDouble();
		
		double closingPrice = 0.1;
		while(true) {
		System.out.println("Enter the closing amount for the day: ");
		closingPrice = price.nextDouble();
		
		double earnings = closingPrice - buyingPrice;
		if (closingPrice < 0.0) break;
		
		if (earnings > 0.0) {
			System.out.println("You have earned " + earnings + " today.");
		}
		else if (earnings < 0.0) {
			System.out.println("You lost " + earnings + " today.");
		}
		else {
			System.out.println("You have no earnings today.");
		}
		
		
		}
				

	}

}
