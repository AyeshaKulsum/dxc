import  java.util.Scanner;
public class ContinueDoWhile {
	Scanner sc = new Scanner(System.in);
int sum=0;
int choice=0;
int count=0;
int num=0;
public void display()
{
	do {
		System.out.println("Please enter number (between 0-100) :" + (++count));
		num=sc.nextInt();
		
		
		if((num>100))
		{
			break;
		}
		if(num<0)
		{
			System.out.println("Negative numbers are not allowed");
			count=count-1;
			continue;
		}
		sum+=num;
		System.out.println("Do you want to continue(1 to continue, any number to exit)");
		choice = sc.nextInt();
	}while(choice==1);
		System.out.println("Your sum is: "+sum);
}
public static void main(String args[]) {
	ContinueDoWhile doWhile= new ContinueDoWhile();
	doWhile.display();
	System.out.println("Thanks for using my program");
}
}
