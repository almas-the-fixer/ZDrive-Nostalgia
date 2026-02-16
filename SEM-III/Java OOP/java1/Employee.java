import java.util.*;
class Employee
{
	int id,age,salary;
	String name,address;
	//Instance or initialised Block
	//It gets called when instance of class or Object is created
	{
		System.out.println("Integrated MCA Department");
		System.out.println("||~~~~~~~~~~~~~~~~~~~~~~~~~~||");
	}
	//Static Block gets Executed before main function
	static
	{
		System.out.println("LJ University");
		System.out.println("*****************");
	}
	
	//Default Constructor
	
	Employee()
	{
	id = 101;
	age = 20;
	salary = 750;
	name = "Almas";
	address = "Juhapura Ahmedabad";
	}
	// Parameterised Constructor
	
	Employee(int i,int a,int s,String n,String add)
	{
	id = i;
	age = a;
	salary = s;
	name = n;
	address = add;
	}
	
	//Overloading constructor
	Employee(int id,int age,String name)
	{
	//`this` keyword is used here to refer to the instance variables of current class to avoid confusion with local variables as they've same names.
	this.id = id;
	this.age = age;		
	this.name = name;
	}
	
	//getSalary Function that increases salary by 10% if its between 1000 and 500
	
	void getSalary()
	{
	if(salary < 1000 && salary > 500)
	{
		salary = salary + (salary/10);
		System.out.println("Salary after raise is: "+salary);
	}
	}
	//Display Function
	void getDetails()
	{
	System.out.println("Employee Id: "+id);
	System.out.println("Employee Age: "+age);
	System.out.println("Employee Salary: "+salary);
	System.out.println("Employee Name: "+name);
	System.out.println("Employee Address: "+address);
	}
	
	
	//main function
	public static void main(String args[])
	{
	Employee e1 = new Employee(); // Employee getting default value from default constructor
	
	System.out.println("");
	System.out.println("Default Consructor:");
	System.out.println("");
	
	e1.getDetails();
	Employee e2 = new Employee(102,21,800,"Harsh","Sanand"); // Employee getting values from parameterised constructor
	
	System.out.println("");
	System.out.println("Parameterised Constructor:");
	System.out.println("");
	
	e2.getDetails();
	System.out.println("");
	e2.getSalary();
	
	System.out.println("");
	Employee e3 = new Employee(103,20,"Nihar");
	System.out.println("Overloading Constructor");
	System.out.println("");
	e3.getDetails();
	}
}






