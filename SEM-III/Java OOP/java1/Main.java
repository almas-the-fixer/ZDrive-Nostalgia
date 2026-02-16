
//This program uses Super KEywords...

import java.util.*;
class Publication
{
	String title;
	float Price;
	Scanner sc = new Scanner(System.in);
	Publication()
	{
		title = "Liberty City Stories";
		Price = 1200;
	}
	Publication(String title,float Price)
	{
		this.title = title;
		this.Price = Price;
	}
	void getData()
	{
		System.out.println("Enter title: ");
		title = sc.nextLine();
		System.out.println("Enter price: ");
		Price = sc.nextFloat();
	}
	void putData()
	{
		System.out.println("Title: "+title);
		System.out.println("Price: "+Price);
	}
}
class Book extends Publication
{
	int p_count;
	Book()
	{
		p_count = 50;
	}
	Book(String title,float Price,int p_count)
	{
		super(title,Price);
		this.p_count = p_count;
	}
	void getData()
	{
		super.getData();
		System.out.println("Enter The Page Count: ");
		p_count = sc.nextInt();
	}
	void putData()
	{
		super.putData();
		System.out.println("Page Count: "+p_count);
	}
}
class Tape extends Publication
{
	float tape;
	Tape()
	{
		tape = 11;
	}
	Tape(String title,float Price,float tape)
	{
		super(title,Price);
		this.tape = tape;
	}
	void getData()
	{
		super.getData();
		System.out.println("Enter the tape value: ");
		tape = sc.nextFloat();
	}
		void putData()
	{
		super.putData();
		System.out.println("Tape: "+tape);
	}
}
class Main
{
	public static void main(String args[])
	{
	Publication p;
	Book b1 = new Book("LCS",180,50);
	Tape t1 = new Tape("TLAD",200,100);
	p = b1;
	//p=t1;
	b1.getData();
	b1.putData();
	p = t1;
	t1.getData();
	t1.putData();
	}
}