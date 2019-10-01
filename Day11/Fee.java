
public class Fee {
int id;
double amtpaid;
void pay(int id,double amt)
{
	System.out.println("1");
}
void pay(int id,float amt)
{
	System.out.println("2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fee f1=new Fee();
f1.pay(123,400.09);
	}

}
