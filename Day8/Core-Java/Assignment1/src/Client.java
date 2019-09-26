
public class Client {
	public static void main(String args[])
	{
		Apple a = new Apple();
		Ball b = new Ball();
		Cat c = new Cat();
		Dog d = new Dog();
		Elephant e = new Elephant();
		a.appleDisplay();
		b.ballDisplay();
		c.catDisplay();
		d.dogDisplay();
		e.elephantDisplay();
	}
}
class Apple
{
	public void appleDisplay()
	{
		System.out.println("This is Apple");
	}
}
class Ball
{
	public void ballDisplay()
	{
		System.out.println("This is Ball");
	}
}
class Cat
{
	public void catDisplay()
	{
		System.out.println("This is Cat");
	}
}
class Dog
{
	public void dogDisplay()
	{
		System.out.println("This is Dog");
	}
}
class Elephant
{
	public void elephantDisplay()
	{
		System.out.println("This is Elephant");
	}
}
