import java.util.*;
interface Exam
{
	boolean Pass(int marks);	
}
interface Classify
{
	String Division(int marks);
}
class Resultt implements Exam,Classify
{
	public boolean Pass(int marks)
	{
		int m = marks;
		boolean b;
		if(m>50)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		return b;
	}
	public String Division(int marks)
	{
		String Div;
		
		if(marks>60)
		{
			Div = "First";
		}
		else if(marks > 50 && marks < 60)
		{
			Div = "Second";
		}
		else
		{
			Div = "No Division";
		}
		return Div;
	}
	public static void main(String args[])
	{
		Resultt r1 = new Resultt();//I Wrote result with only one t so it threw an error i wrote "Result r1 = new Result();" instead of "Resultt r1 = new Resultt"...
		Scanner sc = new Scanner(System.in);
		int marks;
		String Div;
		boolean b;
		
		System.out.println("Enter Marks: ");
		marks = sc.nextInt();
		
		b = r1.Pass(marks);
		System.out.println("Boolean result: "+b);
		
		Div = r1.Division(marks);
		System.out.println("Division: "+Div);
	}
}