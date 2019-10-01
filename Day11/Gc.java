class Employee{
	int salary;
	public void finalize()
	{
		System.out.println("Employee Object reclaimed -FINALIZE CALLED");
	}
}
public class Gc {
public static void main(String args[])
{
	Employee e1 = new Employee();
	e1.salary=9000;
	System.out.println("Employee Object created");
	Employee e2 = new Employee();
	e1=e2;
	System.out.println(e1.salary);
	System.gc();
}
}
