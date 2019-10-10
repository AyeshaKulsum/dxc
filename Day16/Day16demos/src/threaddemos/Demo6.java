package threaddemos;

public class Demo6 extends Thread{
	Thread  t1,t2;
	public Demo6()
	{
		t1=new Thread(this);
		t1.setPriority(1);
		t1.setName("T1");
		t1.start();
		t2=new Thread(this);
		t2.setPriority(150);
		t2.start();

		System.out.println("CONS CALLED "+Thread.currentThread().getName());
	}
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("RUN CALLED "+Thread.currentThread().getName());
			System.out.println("RUN Thread"+Thread.currentThread().getPriority());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
public static void main(String[] args) {
	new Demo6();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("MAIN CALLED "+Thread.currentThread().getName());
		System.out.println("MAIN THREAD PRIORITY "+Thread.currentThread().getPriority());
	
}
}
