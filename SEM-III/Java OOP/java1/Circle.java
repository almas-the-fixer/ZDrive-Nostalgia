import java.util.*;
class Shape
{
	//int l,b;
	Scanner input = new Scanner(System.in);
	
	Double Circumference()
	{
		double radius,result;
		
		System.out.println("Enter Radius of Circle: ");
		radius = input.nextDouble();
		result = 2.0 * 3.14 * radius;
		return result;
	}
}
class Circle extends Shape
{
	
	public static void main(String args[])
	{
		Double result;
		Circle c1 = new Circle();
		result = c1.Circumference();
		System.out.println("Circumference  of Circle is: "+result);
	}
}