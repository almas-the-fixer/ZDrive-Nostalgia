import java.util.*;
class Example
{
	int id;
	void getDetails()
	// `this` Keyword referrs to current Object in this case `e1`
	{
	System.out.println(this);	
	}
	
	public static void main(String args[])
	{
	Example e1 = new Example();
	System.out.println(e1); //address of e1 is being printed
	e1.getDetails(); // same using function printing the address of e1
	}
}
