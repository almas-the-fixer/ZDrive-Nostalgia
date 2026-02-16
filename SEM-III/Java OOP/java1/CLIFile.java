import java.io.*;
class CLIFile
{
	public static void main(String args[])
	{
	try
	{
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
		String line;
		while((line = br.readLine()) != null)
		{
			bw.write(line);
			//bw.newLine();
		}
		bw.close();
		br.close();
		System.out.println("Data Written Successfully!!");
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}