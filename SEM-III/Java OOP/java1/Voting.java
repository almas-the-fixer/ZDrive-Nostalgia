import java.util.*;
class CustException extends Exception
{
	public String toString()
	{
		return "You are Not Eligible to Vote!";
	}
}
class Voting	
{
	public static void main(String args[])
	{
		int AGE;
		Scanner input = new Scanner(System.in);
	
	
		System.out.println("Enter Your AGE: ");
		AGE = input.nextInt();
	
		if(AGE < 18)
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
			System.out.println("You Are Eligible For Voting");
		}
	}
}