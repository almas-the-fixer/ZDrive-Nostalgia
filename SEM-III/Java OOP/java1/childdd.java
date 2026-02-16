//Final Class Demo
final class Parent  //final class cannot be extended or inherited
{
	final void display()
	{
		System.out.println("Final Parent class: ");
	}
}
class Childdd extends Parent //This will throw error because parent class is final
{
	void display()
	{
		System.out.println("Childdd class: ");
	}
	public static void main(String args[])
	{
		Childdd c1 = new Childdd();
		c1.display();
	}
}
