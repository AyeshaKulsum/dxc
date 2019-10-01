
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer quotes =new StringBuffer();
	System.out.println(quotes.capacity());
	quotes.append("ppppppppppppppppQ");
	System.out.println(quotes.capacity());
	System.out.println(quotes.length());
}
}
