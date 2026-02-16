import java.util.*;
class CustException extends Exception
{
	public String toString()
	{
		return "#ERROR!! Enter Less than 9";
	}
}
class Checkkk	
{
	public static void main(String args[])
	{
	int number;
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter a Number: ");
	number = input.nextInt();
	
	if(number < 9)
	{
		try
		{
			throw new CustException();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	else
	{
		System.out.println("Result: "+number*number);
	}
	}
}