package task;
import java.util.Scanner;
public class Country {
	String number;
	Scanner sc=new Scanner(System.in);
	public void details()
	{
		System.out.println("Enter Phone Number");
		number=sc.next();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();
		India a = new India();
		Brazil b = new Brazil();
		Norway c = new Norway();
		Qatar d = new Qatar();
		Turkey e = new Turkey();
		country.details();
		//char[] chars = str.toCharArray();
		if((country.number.charAt(1)=='9')&&(country.number.charAt(2)=='1'))
		{
			a.numberFormat();
		}
		if((country.number.charAt(1)=='5')&&(country.number.charAt(2)=='5'))
		{
			b.numberFormat();
		}
		if((country.number.charAt(1)=='4')&&(country.number.charAt(2)=='7'))
		{
			c.numberFormat();
		}
		if((country.number.charAt(1)=='9')&&(country.number.charAt(2)=='7')&&(country.number.charAt(2)=='4'))
		{
			d.numberFormat();
		}
		if((country.number.charAt(1)=='9')&&(country.number.charAt(2)=='0'))
		{
			e.numberFormat();
		}
		else
		{
			System.out.println("none of the country given");
		}
	}

}
class India extends Country{
	
	public boolean numberFormat()
	{
		
	}
}
 class Brazil extends Country{
	
	public boolean numberFormat()
	{
		
	}
}
 class Norway extends Country{
	String number;
	public boolean numberFormat()
	{
		
	}
}
 class Qatar extends Country{
	
	public boolean numberFormat()
	{
		
	}
}
 class Turkey extends Country{
	
	public boolean numberFormat()
	{
		
	}
}