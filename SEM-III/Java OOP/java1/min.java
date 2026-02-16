import java.util.*;
class Minnumber
{
	public static void main(String args[])
	{
	int a,b,c,min;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number a");
	a = sc.nextInt();
	System.out.println("Enter Number b:");
	b = sc.nextInt();
	System.out.println("Enter Number c:");
	c = sc.nextInt();
	
	min = (a<b)?(a<c?a:c):(b<c?b:c);
	
	System.out.println("Minimum Number is : "+min);
	
	}
}