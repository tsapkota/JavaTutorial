package java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Hascode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,45,55,3,32,22,22,55,1));
	      HashSet<Integer> hCheckSet = new HashSet<>();
	      HashSet<Integer> hTargetSet = new HashSet<>();
	      for (Integer integer : arr) {
	         if(!hCheckSet.add(integer)) {
	            hTargetSet.add(integer);
	         }
	      }
	      System.out.println("Duplicate integers in given list is/are " + hTargetSet);

	}

}
