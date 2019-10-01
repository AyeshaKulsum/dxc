import java.util.StringTokenizer;
public class StringTokenizerDemo {
public static void main(String[] args) {
	String message="I’ve been reading books of old\r\n" + 
			"The legends and the myths\r\n" + 
			"Achilles and his gold\r\n" + 
			"Hercules and his gifts\r\n" + 
			"Spider-Man’s control\r\n" + 
			"And Batman with his fists\r\n" + 
			"And clearly I don’t see myself upon that list";
	StringTokenizer st = new StringTokenizer(message);
	System.out.println(st.countTokens());
	String mg="String:Message:THE:No";
	StringTokenizer st1 = new StringTokenizer(mg,":");
	System.out.println(st1.countTokens());
	int count=0;
	int totalToken=st.countTokens();
	while(st.hasMoreTokens())
	{
		count++;
		System.out.println(count+" "+st.nextToken());
	}
	System.out.println("Total Words are :"+totalToken);
	int total=st1.countTokens();
	while(st1.hasMoreTokens())
	{
		count++;
		System.out.println(count+" "+st1.nextToken());
	}
	System.out.println("Total Words are :"+total);
}
}
