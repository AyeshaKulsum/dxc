
public class ExceptionDemos2 {
	public void display()
	{
		System.out.println("DISPLAY STARTED");
		try {
			int a=(2/0);
		}
		catch(Exception e)
		{
			System.out.println("Cannot be divided by zero");
		}
		System.out.println("DISPLAY ENDED");
	}
public static void main(String[] args) {
	System.out.println("MAIN STARTED");
	ExceptionDemos2 demos= new ExceptionDemos2();
	demos.display();
	System.out.println("MAIN ENDED");
}
}
