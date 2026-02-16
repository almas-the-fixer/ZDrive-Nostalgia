import java.util.*;
import java.io.*;

class StudentFH
{
	int roll_no;
	String name;
	Scanner sc = new Scanner(System.in);
	
	static
	{
		System.out.println("Static Block Loading Program......");
		System.out.println("Program to Write Student Data in Files....");
	}
	
	void getData()
	{
		System.out.println("Enter Student Name:");
		name = sc.nextLine();
		System.out.println("Enter Student Roll no: ");
		roll_no = sc.nextInt();
	}
	void writeData()
	{
		System.out.println("Writing Data in Student.txt ....");
		File f1 = new File("Z:/Filehandling/Student.txt");
		try
		{
			if(!f1.exists())
			{
				f1.createNewFile();
				System.out.println("File Created Sucessfully");
			}
			else
			{
				System.out.println("File already Exists!");
			}
			
			
			
			FileWriter fw = new FileWriter("Z:/Filehandling/Student.txt",true);//true is for append
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Roll no: "+roll_no);
			bw.newLine();
			bw.write("Name: "+name);
			bw.newLine();
			bw.close();
			fw.close();
			System.out.println("Data Written!!");
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong!!");
		}
	}
	public static void main(String args[])
	{
		StudentFH s1 = new StudentFH();
		s1.getData();
		s1.writeData();
		
		StudentFH s2 = new StudentFH();
		s2.getData();
		s2.writeData();
		
		StudentFH s3 = new StudentFH();
		s3.getData();
		s3.writeData();
		
		StudentFH s4 = new StudentFH();
		s4.getData();
		s4.writeData();
	}
}