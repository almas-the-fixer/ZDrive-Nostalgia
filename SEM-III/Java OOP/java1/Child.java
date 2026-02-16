class Parent1
{
	void Display_X()
	{
		System.out.println("This is Parent 1 class!");
	}
}
class Parent2 extends Parent1
{
	void Display_Y()
	{
		System.out.println("This is Parent 2 class!!");
	}
}
class Child extends Parent2
{
	void Display_Z()
	{
		System.out.println("This is Child Class!!!");
	}
	public static void main(String args[])
	{
		Child c1 = new Child();
		c1.Display_X();
		c1.Display_Y();
		c1.Display_Z();
	}
}