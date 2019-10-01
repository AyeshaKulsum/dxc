
public class VarArgsDemo {
public static int sum(int p, int...numbers)
{
	int sum=0;
	for(int i:numbers)
		sum+=i;
	return sum;
}
	public static void main(String[] args) {
		
System.out.println(sum(78,8,81));
System.out.println(sum(8,8,8,8,8,8,8));

	}

}
