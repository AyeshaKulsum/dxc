class CheckPassword1
{
	
	private class PasswordDecrypt
	{
		
		void encryptionDone()
		{
			System.out.println("Password Verification Done");
		}
		
	}
	void display()
	{
		PasswordDecrypt decrypt=new PasswordDecrypt();
		decrypt.encryptionDone();
	}
}
public class Demo2 {

	public static void main(String[] args) {
		CheckPassword1 password=new CheckPassword1();
		password.display();

	}

}
