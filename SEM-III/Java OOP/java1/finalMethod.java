//Final Method Demo
class Parent  
{
	final void display() // Final MEthod cannot be overridden
	{
		System.out.println("Final Parent class: ");
	}
}
class FinalMethod extends Parent 
{
	void display() // This will throw error because we cannot override final method
	{
		System.out.println("Childdd class: ");
	}
	public static void main(String args[])
	{
		FinalMethod c1 = new FinalMethod();
		c1.display();
	}
}
