class Parent
{
	//member access specifiers are 3  1.`public` 2.`private` 3.`protected` default is public
	
	//public int can be accessed anywhere in program 
	public int a = 5;  
	//private int a = 5;
	
	//private keyword restricts access to other classes they cant use int access
	//protected int a = 5; 
	
	//protected keyword allows access upto 2 child classes 
	
	/*static*/ /*final*/ //use static or final in front of parent display method to prevent method overriding....
	void display()
	// now if i use static keyword in parent method it cannot be overridden..... or even if i write `final` keyword in parent method it cannot be overridden too...
	{
		System.out.println("A is: "+a);
	}
}
class Childd extends Parent
{
	int b = 10;
	
	void display() // Method overriding i.e method of same name will be first searched in child class if not found then parent...
	{
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
	}
	public static void main(String args[])
	{
		Childd c = new Childd();
		
		c.display();
	}
}