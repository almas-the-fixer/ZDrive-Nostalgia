import java.lang.*;
class ExceptionDemo2
{
	public static void main(String args[])
	{
		
		int arr[] = new int[5];
		try // Write critical code that can possibly throw exceptions
		{
			arr[7] = 5 / 0;
		}
		/*
		catch(Exception e) // Catch exception and genertate a custom message 
		{
			System.out.println("Something Went Wrong!!!");
		}
		*/
		catch(ArithmeticException e)
		{
			System.out.println("Zero cannot Divide any Number!!");
		}
		finally //Finally Block Excecutes regardless if there is exception or not......
		{
			System.out.println("Finally Block Executes Regardless if there is some Exception or not...");
		}
	}
}