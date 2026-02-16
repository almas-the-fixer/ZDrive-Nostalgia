import java.util.*;
class Shape
{
	//int l,b;
	Scanner input = new Scanner(System.in);
	
	int Area()
	{
		int Base,Altitude,result;
		
		System.out.println("Enter Length of Base of Triangle: ");
		Base = input.nextInt();
		System.out.println("Enter Altitude of Triangle: ");
		Altitude = input.nextInt();
		result = Base * Altitude/2;
		
		return result;
	}
}
class Triangle extends Shape
{
	
	public static void main(String args[])
	{
		int result;
		Triangle t1 = new Triangle();
		result = t1.Area();
		System.out.println("Area of Triangle is: "+result);
	}
}