package java11;

class Car {		// parent class
	String color = "blue";

	public void horn() {
		System.out.println("This car has horn.");
	}
}

class RunnerCar extends Car{		// child class
	String color = "red";
	public void run() {
		System.out.println("This car can run as well. The color of this car is "+ color);
		System.out.println("This car is " + super.color + " in color.");
		super.horn();
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c = new Car();
		//c.horn();
		
		RunnerCar rc = new RunnerCar();
		//rc.horn();
		rc.run();
		
	}

}
