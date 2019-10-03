package dxc;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {

	public HashSetDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set panNumbers = new HashSet();
		panNumbers.add("Ayesha");
		panNumbers.add("Kavya");
		panNumbers.add("Divya");
		panNumbers.add("Priya");
		panNumbers.add("Ayesha");
		panNumbers.add("sam");
		System.out.println(panNumbers);
		System.out.println(panNumbers.contains("Ayesha"));
		System.out.println(panNumbers.isEmpty());	
		System.out.println(panNumbers.remove(3));
		System.out.println(panNumbers.size());
		
	}

}
