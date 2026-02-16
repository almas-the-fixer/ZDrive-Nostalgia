import java.util.*;
class Shape
{
	//int l,b;
	Scanner input = new Scanner(System.in);
	
	static int Area(int length,int width) // had to make this method static to be able to use it in main class
	{
		//int length,width;
		
		/*
		System.out.println("Enter Length of Rectangle: ");
		length = input.nextInt();
		System.out.println("Enter Width of Rectangle: ");
		width = input.nextInt();
		*/
		
		return length * width;
	}
}
class Rectangle extends Shape
{
	int result;
	static Rectangle r1 = new Rectangle(); // had to use static to make this object usable in main class
	//System.out.println("Area of Rectangle is: "+result);
}
class Cuboid extends Rectangle
{
	int Volume(int rec)
	{
		int depth,volume;
		System.out.println("Enter The Depth of Cuboid: ");
		depth = input.nextInt();
		volume = rec * depth;
		
		return volume;
	}
	public static void main(String args[])
	{
		int ans,rec;
		Cuboid v1 = new Cuboid();
		rec = r1.Area(10,20);
		ans = v1.Volume(rec);
		
		System.out.println("The Volume is :"+ans);
	}
}