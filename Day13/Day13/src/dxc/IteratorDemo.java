package dxc;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public IteratorDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set panNumbers = new HashSet();
		panNumbers.add("Ayesha");
		panNumbers.add("Kavya");
		panNumbers.add("Seeta");
		panNumbers.add("Sangeetha");
		panNumbers.add("Sam");
		panNumbers.add("Sameer");
		
		Iterator i = panNumbers.iterator();
		while(i.hasNext())
		{
			String str = (String)i.next();
			if(str.charAt(0)=='S')
			{
			System.out.println(str);
			}
			else
				continue;
		}
	}

}
