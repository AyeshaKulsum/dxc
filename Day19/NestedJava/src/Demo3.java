class CheckPassword3
{
	
	class PasswordDecrypt
	{
		int j=200;
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
public class Demo3 {

	public static void main(String[] args) {
		CheckPassword3 password=new CheckPassword3();
		password.display();
		CheckPassword3.PasswordDecrypt decrypt=password.new PasswordDecrypt();
		decrypt.encryptionDone();

	}

}
