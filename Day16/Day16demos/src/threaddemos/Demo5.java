package threaddemos;

public class Demo5 extends Thread{
	public Demo5(int i) {
		setName(i+"");
		Thread.currentThread().setName("M");
		start();
	}
	@Override
		public void run() {
			System.out.println("RUN CALLED "+Thread.currentThread().getName());
		}
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		new Demo5(i);
	}
	System.out.println("MAIN "+Thread.currentThread().getName());
}
}
