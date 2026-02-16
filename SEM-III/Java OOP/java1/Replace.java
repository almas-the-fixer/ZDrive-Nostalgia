import java.io.*;
import java.nio.file.*;
class Replace
{
	public static void main(String args[])
	{
		Path sp = Paths.get("Z:/Demo/Demo.txt");
		Path tp = Paths.get("Z:/Demo/DemoRenamed.txt");
		
		try
		{
			Files.move(sp,tp,StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File Renamed Successfully!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}