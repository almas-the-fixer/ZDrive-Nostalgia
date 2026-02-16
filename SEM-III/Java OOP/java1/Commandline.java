class MyException extends Exception
{
	public String toString()
	{
		return "Enter Arguments Properly!";
	}
}
class Commandline	
{
	public static void main(String args[])
	{
		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		
		if(args.length < 2 || args.length > 2)
		{
			try
			{
				throw new MyException();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
		else
		{
			System.out.println("Multiplying both numbers by Each Other ^_^");
			System.out.println("Result: "+A*B);
		}
	}
}