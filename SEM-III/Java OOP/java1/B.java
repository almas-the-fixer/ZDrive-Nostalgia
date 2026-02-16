class A
{
	int a;
	A(int a)
	{
		this.a = a;
	}
	void Display_A()
	{
		System.out.println("The Value of `a` is : "+a);
	}
}
class B extends A
{
	int b;
	B(int a,int b)
	{
		super(a); //Super keyword gets value from superclass in this case it takes value of a from class A
		this.b = b;
	}
	void Display_B()
	{
		super.Display_A(); //Here super calls the Display_A function from superclass A
		System.out.println("The Value of `b` is : "+b);
	}
	public static void main(String args[])
	{
		B b1 = new B(10,20);
		b1.Display_B();
	}
}