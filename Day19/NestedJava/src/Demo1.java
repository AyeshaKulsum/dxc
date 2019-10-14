class CheckPassword
{
	
	static class PasswordDecrypt
	{
		int j=200;
		void encryptionDone()
		{
			System.out.println("Password Verification Done");
		}
		
	}
	void display()
	{
		//local class
		class A
		{
		void sing()
		{
			System.out.println("I sing");
		}
		}
		A a =new A();
		a.sing();
		PasswordDecrypt decrypt=new PasswordDecrypt();
		decrypt.encryptionDone();
	}
}
public class Demo1 {

	public static void main(String[] args) {
		CheckPassword password=new CheckPassword();
		password.display();
		CheckPassword.PasswordDecrypt decrypt=new CheckPassword.PasswordDecrypt();
		decrypt.encryptionDone();

	}

}
