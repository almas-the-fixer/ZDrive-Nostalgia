//comments show errors i faced
import java.util.*;
class Book
{
	String bookname;
	String author;
	int price;
	
	Scanner sc = new Scanner(System.in);
	
	Book() // Default Constructor will put the following default values in objects
	{
		bookname = "Abc";
		author = "Mahesh!";
		price = 100;
	}
	Book(String bname,String bauthor,int cost)	//Parameterized Constructor takes one or more parameters
	{
		bookname = bname;
		author = bauthor;
		price = cost;
	}
	Book(String bname,String bauthor)	//Overloading constructor 
	{
		bookname = bname;
		author = bauthor;
	}
	Book(Book b2)
	{
		this.bookname = b2.bookname; // this keyword is referring to current object i.e b3
		this.author = b2.author; // So b3.author this value will come from b2.author..
		this.price = b2.price;
	}
	
	/*void getDetails()
	{
		System.out.println("Enter the Name of the Book:");
		bookname = sc.nextLine(); // Forgot to write variable name after sc ..... so value wasn't stored in variables
		System.out.println("Enter the Author of the Book:");
		author = sc.nextLine();
		System.out.println("Enter the Price of the Book:");
		price = sc.nextInt();
	}*/
	void displayDetails()
	{
		System.out.println("Book Name:"+bookname);
		System.out.println("Book Author:"+author);
		System.out.println("Book Price:"+price);
	}

public static void main(String args[])
{
	Book b1 = new Book();//Forgot () after Book
	Book b2 = new Book("abcd","harsh",500); // this object is created using parameterized constructor.
	Book b3 = new Book(b2); // This Object is created using Copy constructor it will copy values of b2.
	Book b4 = new Book("book4","nihar"); // This Object is created using 2 parameters only.
	//Book b2 = new Book();
	//Book b3 = new Book();
	
	//b1.getDetails();
	//We directly Displayed details without getting from user but it will take default values from constructor
	b1.displayDetails();
		System.out.println("");
	System.out.println("Parameterised Constructor:");
	System.out.println("");

	b2.displayDetails();//Displaying Parameterised constructor
		System.out.println("");

	System.out.println("Copy Constructor:");
		System.out.println("");
	
	b3.displayDetails();//Displaying using copy constructor 
		System.out.println("");

	System.out.println("Overloading Constructor:");
		System.out.println("");

	b4.displayDetails();//Constructor Overloading 
	
	//b2.getDetails();
	//b2.displayDetails();
	//b3.getDetails();
	//b3.displayDetails();
}
}