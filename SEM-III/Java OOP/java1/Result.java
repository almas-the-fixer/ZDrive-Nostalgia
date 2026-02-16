import java.util.*;
class Student
{
	int id = 1;
	String name = "Almas";
}
class Result extends Student  //Program must be saved with name of class with main method inside it!!
{ 
	int J_marks = 50,Sql_marks = 50;
	public static void main(String args[])
	{
		Result r1 = new Result();
		System.out.println("Student Id:"+r1.id+" | Student Name: "+r1.name);
		System.out.println("Marks in Java: "+r1.J_marks+" Marks in PLSql: "+r1.Sql_marks);
	}
}