import java.util.*;
abstract class ShapeArea
{
	abstract void area();
}
class Triangle extends ShapeArea
{
	Scanner sc = new Scanner(System.in);
	void area()
	{
		int base,height,area;
		System.out.println("Enter Base of Triangle: ");
		base = sc.nextInt();
		System.out.println("Enter Height of Triangle: ");
		height = sc.nextInt();
		
		area = (base * height)/2;
		System.out.println("Area of Triangle is: "+area);
	}
}
class Rectangle extends ShapeArea
{
	Scanner sc = new Scanner(System.in);
	void area()
	{
		int length,breadth,rArea;
		System.out.println("Enter The Length of Rectangle: ");
		length = sc.nextInt();
		System.out.println("Enter The Breadth of Rectangle: ");
		breadth = sc.nextInt();
		
		rArea = length * breadth;
		System.out.println("Area of Rectangle is: "+rArea);
	}
}
class Circle extends ShapeArea	
{
	Scanner sc = new Scanner(System.in);
	void area()
	{
		Double rad,cArea;
		
		System.out.println("Enter The Radius of the Circle: ");
		rad = sc.nextDouble();
		
		cArea = Math.PI * rad * rad;
		System.out.println("Area of Circle is: "+cArea);
	}
}
class Run
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		t1.area();
		r1.area();
		c1.area();
	}
}