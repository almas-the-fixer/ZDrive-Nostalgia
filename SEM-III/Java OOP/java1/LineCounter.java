import java.io.*;
class LineCounter
{
	public static void main(String args[])
	{
		System.out.println("Trying to Count lines in a File...\n");
		int count;
		count = 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			while(br.readLine() != null)
			{
				count++;
			}
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong!!");
		}
		System.out.println("No of lines: "+count);
	}
}