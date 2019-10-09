package threaddemos;

public class Demo3 extends Thread{
	Thread  t1,t2;
	public Demo3()
	{
		t1=new Thread(new Music());
		t1.setName("1");
		t1.start();
		t2=new Thread(new Score());
		t2.setName("2");
		t2.start();
		System.out.println("CONS CALLED "+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	Thread tt=Thread.currentThread();
	tt.setName("BOSS");
	new Demo3();
	System.out.println("MAIN CALLED "+Thread.currentThread().getName());
}
}
class Music extends Thread
{
	@Override
	public void run() {
		System.out.println("MUSIC RUN CALLED BY:"+Thread.currentThread().getName());
	}
}
class Score extends Thread
{
	@Override
	public void run() {
		System.out.println("SCORE RUN CALLED BY:"+Thread.currentThread().getName());
	}
}