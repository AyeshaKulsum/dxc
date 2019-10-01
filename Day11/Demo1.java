class Mammal{
	int age=10;
	protected void eat()
	{
		System.out.println("All mammals eats");
	}
}
class Dog extends Mammal
{
	public void eat()
	{
		System.out.println("Dog eats");
	}
}
public class Demo1 {
public static void main(String[] args) {
	Dog d=new Dog();
	d.eat();
	
}
}
