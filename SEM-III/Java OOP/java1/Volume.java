import java.util.*;
class Shape
{
	//int l,b;
	Scanner input = new Scanner(System.in);
	
	int Area()
	{
		int length,width;
		
		System.out.println("Enter Length of Rectangle: ");
		length = input.nextInt();
		System.out.println("Enter Width of Rectangle: ");
		width = input.nextInt();
		
		return length * width;
	}
}
class Rectangle extends Shape
{
	int result;
	Rectangle r1 = new Rectangle();
	//System.out.println("Area of Rectangle is: "+result);
}
class Cuboid extends Rectangle
{
	int Volume()
	{
		int depth,volume;
		System.out.println("Enter The Depth of Cuboid: ");
		depth = input.nextInt();
		result = r1.Area();
		volume = result * depth;
		
		return volume;
	}
	public static void main(String args[])
	{
		int ans;
		Volume v1 = new Volume();
		
		System.out.println("The Volume is :"+ans);
	}
}