import java.util.Scanner;

public class SwapTwoNumbers {
	
	int num1;
	int num2;
	Scanner sc = new Scanner(System.in);
///To swap two numbers
	
	public void display()
	{
		System.out.println("Enter number 1");
		num1=sc.nextInt();
		System.out.println("Enter number 2");
		num2=sc.nextInt();
		System.out.println("Before Swaping");
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swaping");
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTwoNumbers d = new SwapTwoNumbers();
		d.display();
		
	}

}
