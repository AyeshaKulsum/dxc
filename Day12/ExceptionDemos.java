
public class ExceptionDemos {
	public void display()
	{
		System.out.println("DISPLAY STARTED");
		try {
			int marks[]=new int[-5];
			System.out.println(marks[5]);
		}
		catch(Exception e)
		{
			System.out.println("Array cannot be accessed beyond its length");
		}
		System.out.println("DISPLAY ENDED");
	}
public static void main(String[] args) {
	System.out.println("MAIN STARTED");
	ExceptionDemos demos= new ExceptionDemos();
	demos.display();
	System.out.println("MAIN ENDED");
}
}
