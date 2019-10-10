package threaddemos;
class PrintClass{
	public synchronized static void PrintNames(String firstName,String lastName)
	{
		System.out.println("First Name :"+firstName);
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Last Name :"+lastName);
	}
}
public class Demo8 extends Thread{
Thread t1,t2;
public Demo8() {
	t1=new Thread(this);
	t1.start();
	t2=new Thread(this);
	t2.start();
	
}
@Override
	public void run() {
		PrintClass.PrintNames("Ayesha", "Kulsum");
	}
public static void main(String[] args) {
	Demo8 d=new Demo8();
	
}
}
