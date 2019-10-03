package dxc;

import java.util.List;
import java.util.Collections;
import java.util.Vector;

public class CollectionsDemo {

	
	public static void main(String[] args) {
		List panNumbers = new Vector();
		panNumbers.add("Ayesha");
		panNumbers.add("Kavya");
		panNumbers.add("Seeta");
		panNumbers.add("Sangeetha");
		panNumbers.add("Sam");
		panNumbers.add("Sameer");
		//System.out.println(Collections.reverse);
		Collections.sort(panNumbers);
		System.out.println(panNumbers);
		int i = Collections.binarySearch(panNumbers, "Sam");
		System.out.println(i);
	}

}
