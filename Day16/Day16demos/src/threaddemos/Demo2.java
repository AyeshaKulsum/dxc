package threaddemos;

public class Demo2 extends Thread{
	Thread  t1,t2;
	public Demo2()
	{
		t1=new Thread(this);
		t1.start();
		t2=new Thread(this);
		t2.start();
		System.out.println("CONS CALLED "+Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("RUN CALLED "+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	new Demo2();
	System.out.println("MAIN CALLED "+Thread.currentThread().getName());
}
}
