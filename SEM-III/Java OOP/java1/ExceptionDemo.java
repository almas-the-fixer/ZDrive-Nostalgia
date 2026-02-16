class ExceptionDemo
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 0;
		int ans;
		try // Write critical code that can possibly throw exceptions
		{
			ans = a/b;
		}
		catch(Exception e) // Catch exception and genertate a custom message 
		{
			System.out.println("Something Went Wrong!!");
		}
	}
}