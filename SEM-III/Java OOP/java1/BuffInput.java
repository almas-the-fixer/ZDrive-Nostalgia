import java.io.*;
class BuffInput
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
			int a,b,result;
			System.out.println("Enter a: ");
			a = Integer.parseInt(b1.readLine());
			System.out.println("Enter b: ");
			b = Integer.parseInt(b1.readLine());
			result = a + b;
			System.out.println("Result: " + result);
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong!!!");
		}
	}
}