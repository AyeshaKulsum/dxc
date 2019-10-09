package threaddemos;

public class Demo4 extends Thread{
	@Override
		public void run() {
			System.out.println("RUN CALLED "+Thread.currentThread().getName());
		}
public static void main(String[] args) {
	Demo4 d= new Demo4();
	d.start();
	System.out.println("MAIN "+Thread.currentThread().getName());
}
}
