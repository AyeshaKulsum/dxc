import java.util.Scanner;

public class AddNumbers {
	
	int num1;
	int num2;
	Scanner sc = new Scanner(System.in);
///To display date and time
	public void display()
	{
		System.out.println("Enter number 1");
		num1=sc.nextInt();
		System.out.println("Enter number 2");
		num2=sc.nextInt();
		System.out.println("The result is : "+(num1+num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumbers d = new AddNumbers();
		d.display();
		
	}

}
