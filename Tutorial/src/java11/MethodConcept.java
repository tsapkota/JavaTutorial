package java11;

import java.util.Scanner;

public class MethodConcept {

	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print the name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		printMyName(name);
	}

}
