package java11;

import java.util.*;



public class Class1 {
	public String color;
	public int speed;
	
/*
	 * Class1(){ color = "red"; speed = 200; }
	 */
	
	
	
	public void title() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the color of a car: ");
		color = sc.nextLine();
		
		System.out.print("What is the maximum speed of the car?");
		speed = sc.nextInt();
		
		System.out.println("The color of my car is " + color + " and it can speed up to " + speed + ".");
	}
}
