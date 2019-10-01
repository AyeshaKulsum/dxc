
public class Z {
	W w=new W();
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("Static block");
	}
	
	public Z()
	{
		System.out.println("Z Constructor");
	}
	
	public static void main(String args[])
	{
		System.out.println("In main");
		new Z();
		new Z();
	}
}
