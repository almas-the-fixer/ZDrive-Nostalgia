import java.io.*;
class delFile
{
	public static void main(String args[])
	{
		File f1 = new File("Z:\\SEM - III\\Java OOP\\Unit-4\\deleted.txt");
		
		if(f1.exists())
		{
			boolean isDeleted = f1.delete();
			if(isDeleted)
			{
				System.out.println("File Deleted Successfully!!");
			}
			else
			{
				System.out.println("Failed to Delete File!..");
			}
		}
		else
		{
			System.out.println("File Doesnt Exist!!");
		}
	}
}