package threaddemos;

public class Demo7 extends Thread{
	public Demo7(int i) {
		setName(i+"");
		Thread.currentThread().setName("M");
		if(i==3)
			setPriority(10);
		start();
	}
	@Override
		public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("RUN CALLED "+Thread.currentThread().getName());
		}
public static void main(String[] args) {
	 for (int i = 0; i <=3; i++) {
		new Demo7(i);
	}
	System.out.println("MAIN "+Thread.currentThread().getName());
}
}
