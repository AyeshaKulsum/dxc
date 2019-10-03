
public class Convert {
public static void main(String[] args) {
	String marks="90";
	int i =Integer.parseInt(marks);
	System.out.println(i+5);
	int p =90;
	//converting primitive to object(Boxing)
	Integer p1=new Integer(p);
	System.out.println(p+6);
	//Unboxing
	int k=p1.intValue();
	System.out.println(k+6);
	//>1.5
	
	//Auto unboxing
	int k1=p1;
	System.out.println(k1+6);
	//Auto Boxing
	Integer pp=k1;
	System.out.println(pp+6);
}
}
