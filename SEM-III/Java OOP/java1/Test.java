class MyException extends Exception
{
	public String toString()
	{
		return "Errorrrr";
	}
	public String getMessage()
	{
		return "Exception occured";
	}
}
class Test	
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}