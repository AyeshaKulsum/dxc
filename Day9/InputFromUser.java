import java.util.Scanner;

public class InputFromUser {
	
	
///To get input from user
	Scanner sc = new Scanner(System.in);
	int age;
	String personName;
	public void display()
	{
		//system.out.println("a");
		
		
		System.out.println("Please enter your name");
		personName=sc.next();
		 System.out.println("Please enter your age");
		 age= sc.nextInt();
		 
		 System.out.println("Name : "+personName);
		 System.out.println("Age : "+age);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputFromUser d = new InputFromUser();
		d.display();
		
	}

}
