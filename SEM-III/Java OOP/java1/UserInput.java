import java.util.*;
class UserInput
{
	public static void main(String args[])
	{
	String name,address;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name:");
	name = sc.nextLine();
	System.out.println("Enter Address:");
	address = sc.nextLine();
	
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	}
}