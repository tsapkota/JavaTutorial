package java11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int roll;

	public Student(String name, int roll) {
		// super();
		this.name = name;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
}

class Sortbyroll implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.roll - b.roll;
	}
	// Comparator is delivered java interface. Once you create a class always add
	// implements Comparator
	// This is ask you to import Comparator package as well as create unimplemented
	// java class method below.
}

class Sortbyname implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> myList = new ArrayList<Student>();
		myList.add(new Student("Tilak", 32));
		myList.add(new Student("Josh", 35));
		myList.add(new Student("Reggie", 60));
		myList.add(new Student("Brandon", 28));
		myList.add(new Student("Mike", 30));

		for (int i = 0; i < myList.size(); i++)
			System.out.println(myList.get(i)); // prints the list in the order of list

		 Collections.sort(myList, new Sortbyname()); // does the sorting by name

		 System.out.println("After Sorting by name: " + myList); // prints the list after sorting by name
		 
		 Collections.sort(myList, new Sortbyroll()); // does the sorting by roll
		 
		 System.out.println("After Sorting by roll: " + myList);

	}
}
