class Parent
{
	void Display_main()
	{
		System.out.println("This is Parent Class `A`!");
	}
}
class Kid_B extends Parent
{
	void Display_B()
	{
		System.out.println("This is `Kid_B` class!");
	}
}
class Kid_C extends Parent
{
	void Display_C()
	{
		System.out.println("This is `Kid_C` class!");
	}
}
class Kid_D extends Parent
{
	void Display_D()
	{
		System.out.println("This is `Kid_D` class!");
	}
}
class Hierarchy extends Parent
{
	
	public static void main(String args[])
	{
		Kid_B b1 = new Kid_B();
		Kid_C c1 = new Kid_C();
		Kid_D d1 = new Kid_D();
		
		System.out.println("");
		b1.Display_B();
		b1.Display_main();
		System.out.println("");
		c1.Display_C();
		c1.Display_main();
		System.out.println("");
		d1.Display_D();
		d1.Display_main();
	}
}