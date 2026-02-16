import java.io.*;
class Create
{
	public static void main(String args[])
	{
		File f1 = new File("Z:/Demo/Demo.txt");
		try
		{
			if(!f1.exists())
			{
				f1.createNewFile();
				System.out.println("File Created Successfully!!");
			}
			else
			{
				System.out.println("File already Exists!!");
			}
			//Writing in File
			FileOutputStream fout = new FileOutputStream("Z:/Demo/Demo.txt");
			String s = "This is Some Random Text";
			byte[] b = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Data Writen Successfully!!");
			//Reading file from cmd
			FileInputStream finp = new FileInputStream("Z:/Demo/Demo.txt");
			int i;
			while((i = finp.read()) != -1)
			{
				System.out.print((char)i);
			}
			finp.close();
			//MODIFYING CONTENT 
			FileOutputStream fout1 = new FileOutputStream("Z:/Demo/Demo.txt");
			String str = "Content Modified!!!";
			byte[] b1 = str.getBytes();
			fout1.write(b1);
			fout1.close();
			System.out.println("\nFile Modified Successfully!!");
			FileInputStream finp1 = new FileInputStream("Z:/Demo/Demo.txt");
			int j;
			while((j = finp1.read())!= -1)
			{
				System.out.print((char)j);
			}
			finp1.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Creating File!!");
		}
	}
}