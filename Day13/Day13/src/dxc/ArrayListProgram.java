package dxc;

import java.util.List;
import java.util.ArrayList;

public class ArrayListProgram {

	public ArrayListProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ayesha");
		names.add("Kavya");
		names.add("Divya");
		names.add("Priya");
		names.add("Ayesha");
		names.add("sam");
		System.out.println(names);
		System.out.println(names.contains("Ayesha"));
		System.out.println(names.isEmpty());
		System.out.println(names.get(0));
		System.out.println(names.indexOf("Kavya"));
		System.out.println(names.remove(3));
		System.out.println(names.lastIndexOf("Ayesha"));
		System.out.println(names.size());
		
	}

}
