//Final Variable Demo
class Parent  
{
	void display()
	{
		final int a = 10; //final variable's value cannot be changed once its declared final
		a = 15; // This will throw error because we cannot change final variable's value
		System.out.println("Value of Final Variable a:  "+a);
	}
}
class FinalVariable extends Parent 
{
	void display() 
	{
		System.out.println("Childdd class: ");
	}
	public static void main(String args[])
	{
		FinalVariable c1 = new FinalVariable();
		c1.display();
	}
}
