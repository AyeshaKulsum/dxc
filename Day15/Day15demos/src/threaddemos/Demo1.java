package threaddemos;

public class Demo1 extends Thread{
	Thread  t1;
	public Demo1()
	{
		t1=new Thread(this);
		t1.start();
		System.out.println("CONS CALLED"+Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("RUN CALLED"+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	new Demo1();
	System.out.println("MAIN CALLED"+Thread.currentThread().getName());
}
}
