
public class defaultValues {
	byte a;
	int b;
	//float c;
	double d;
	boolean mask;
	char c ;
	short ds;
	int sa;
	long fd;
	String name="Ayesha";
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(mask);
		System.out.println(c);
		System.out.println(ds);
		System.out.println(sa);
		System.out.println(fd);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		defaultValues d = new defaultValues();
		d.display();
		
	}

}
