abstract class Vehicle
{
	abstract void display();
}
class Car extends Vehicle
{
	void display()
	{
		System.out.println("Carrrrr!!!");
	}
}
class Truck extends Vehicle
{
	void display()
	{
		System.out.println("Truckkkkkk!!!");
	}
}
class Demo	
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Car c1 = new Car();
		Truck t1 = new Truck();
		
		c1.display();
		t1.display();
	}
}