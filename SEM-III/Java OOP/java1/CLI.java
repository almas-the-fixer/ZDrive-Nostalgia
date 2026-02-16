class CustException extends Exception
{
	public String toString()
	{
		return "You are Not Eligible to Vote!";
	}
}
class CLI	
{
	public static void main(String args[])
	{
		int AGE = Integer.parseInt(args[0]); // Taking Argument from Command line i.e java CLI '19'... and then parsing it to int rest of program is sameeee.......
	
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