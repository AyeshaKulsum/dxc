package threaddemos;

import java.util.Enumeration;
import java.util.Properties;

public class CheckVersions {
public static void main(String[] args) {
	String str=System.getProperty("os.name");
	System.out.println(str);
	String str2=System.getProperty("java.version");
	System.out.println(str2);
	Properties all=System.getProperties();
	System.out.println(all);
	Enumeration<Object> elements=all.elements();
	while(elements.hasMoreElements())
	{
		System.out.println(elements.nextElement());
	}
}
}
