
public class InstanceandLocalVariable {
	//Local variable should be initialised explicitly
	final int i=100;
	public void display()
	{
		int j;
		if(i<200)
		{
			j=20;
		}
		System.out.println(i+j);
	}
	public static void main(String args[])
	{
		InstanceandLocalVariable d = new InstanceandLocalVariable();
		d.display();
	}
}
