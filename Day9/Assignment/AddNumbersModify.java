import java.util.Scanner;

public class AddNumbersModify {
	
	int num1;
	int num2;
	Scanner sc = new Scanner(System.in);
///Modified add numbers which don't allow negative number
	public void display()
	{
		System.out.println("Enter number 1");
		num1=sc.nextInt();
		System.out.println("Enter number 2");
		num2=sc.nextInt();
		if((num1<0)||(num2<0))
		{
			System.out.println("Please Enter Positive number");
		}
		else {
			System.out.println("The result is : "+(num1+num2));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumbersModify d = new AddNumbersModify();
		d.display();
		
	}

}
