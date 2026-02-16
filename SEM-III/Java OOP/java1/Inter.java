interface I1
{
	int a = 10; // interface variables are always final and static....
	void displayA(); // interface methods are always abstract and public....
}
interface I2
{
	int b = 20;
	void displayB();
}
class Inter implements I1,I2
{
	public void displayA() // Compulsory put public in Child class using interface....
		{
			System.out.println("Child Class from interface I1!!");
			System.out.println(a);
		}
	public void displayB()
	{
		System.out.println("Child Class from interface I2!!");
		System.out.println(b);//calling interface i2 variable b
	}
	public static void main(String args[])
	{
		Inter ii = new Inter();
		ii.displayA();
		System.out.println(">>>>"+a+"<<<<Interface variable called without object"); // calling interface variables without object bcoz its static....
		ii.displayB();
	}
}