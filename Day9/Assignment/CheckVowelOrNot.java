import java.util.Scanner;

public class CheckVowelOrNot {
	
	char vowel='a';
	Scanner sc = new Scanner(System.in);
///To check vowel or not
	public void display()
	{
		System.out.println("Enter a Alphabet");
		vowel=sc.next().charAt(0);
		if((vowel=='a')||(vowel=='e')||(vowel=='i')||(vowel=='o')||(vowel=='u')||(vowel=='A')||(vowel=='E')||(vowel=='I')||(vowel=='O')||(vowel=='U'))
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It's not a vowel");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckVowelOrNot d = new CheckVowelOrNot();
		d.display();
		
	}

}
