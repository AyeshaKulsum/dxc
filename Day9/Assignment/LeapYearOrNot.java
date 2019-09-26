import java.util.Scanner;

public class LeapYearOrNot {
	
	int year;
	boolean flag;
	Scanner sc = new Scanner(System.in);
///To display Leap year or not
	public void display()
	{
		System.out.println("Enter a year");
		year=sc.nextInt();
		if((year%400==0))
		{
			flag = true;
		}
		else if(year%100==0)
		{
			flag = false;
		}
		else if(year%4==0)
		{
			flag = true;
		}
		else {
			flag = false;
		}
		if(flag)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year+" is a not leap year");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeapYearOrNot d = new LeapYearOrNot();
		d.display();
		
	}

}
