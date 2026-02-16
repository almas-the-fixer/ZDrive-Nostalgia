import java.util.*;
class Maxnumber
{
	public static void main(String args[])
	{
	int a,b,c,max;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number a");
	a = sc.nextInt();
	System.out.println("Enter Number b:");
	b = sc.nextInt();
	System.out.println("Enter Number c:");
	c = sc.nextInt();
	
	max = (a>b)?(a>c?a:c):(b>c?b:c);
	
	System.out.println("Maximum Number is : "+max);
	
	}
}