package java11;

import java.util.Comparator;

public class SortComparator implements Comparator<String>{  
	// Comparator is delivered java interface. Once you create a class always add implements Comparator
	//This is ask you to import Comparator package as well as create unimplemented java class method below.


	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	
}
