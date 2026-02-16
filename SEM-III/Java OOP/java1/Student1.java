class Student1
{
	static int count;
	Student1(int rollno,String name,String location)
	{
		count++;
		System.out.println("Rollno:"+rollno+" Name:"+name+" location:"+location);
	}
	static void display()
	{
	System.out.println("no of objects: "+count);
	}
	
	public static void main(String args[])
		{
		Student1 s1 = new Student1(8,"Almas","Juhapura");
		Student1 s2 = new Student1(60,"Harsh","Sanand");	
		Student1 s3 = new Student1(5,"Vishal","Sanand");	
		Student1 s4 = new Student1(54,"Burhan","Juhapura");	
		Student1 s5 = new Student1(13,"Nihar","PG");

			display();
		}
}