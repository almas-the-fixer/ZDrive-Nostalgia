class Emp
{
	int id,age;
	String name;
	Emp()
	{
		id = 101;
		age = 18;
		name = "Mahesh";
	}
	Emp(int id,int age,String name)	//add String name; after you learn casting
	{
		this.id = id;
		this.age = age;
		this.name = name;
	}
	void displayEmp()
	{
		System.out.println("Emp ID: "+id);
		System.out.println("Emp Age: "+age);
		System.out.println("Emp Name: "+name);
	}
}
class PartTimeEmployee extends Emp
{
	int hrs,rate,id,age;
	PartTimeEmployee()
	{
		id = 101;
		age = 18;
		hrs = 4;
		rate = 100;
	}
	PartTimeEmployee(int id,int age,String name,int hrs,int rate)
	{
		super(id,age,name);
		this.hrs = hrs;
		this.rate = rate;
	}
	void DisplayPte()
	{
		super.displayEmp();
		System.out.println("Emp Hours working: "+hrs);
		System.out.println("Emp Rate per hour: "+rate);
	}
}
class FullTimeEmployee extends Emp
{
	int BasicPay,DA,id,age;
	
	FullTimeEmployee()
	{
			id = 101;
			age = 18;
			BasicPay = 5000;
			DA = 1000;
	}
	FullTimeEmployee(int id,int age,String name,int BasicPay,int DA)
	{
			super(id,age,name);
			this.BasicPay = BasicPay;
			this.DA = DA;
	}
	void DisplayFte()
	{
		super.displayEmp();
		System.out.println("Emp Basic Pay: "+BasicPay);
		System.out.println("Emp DA: "+DA);
	}
	public static void main(String args[])
	{
			FullTimeEmployee f1 = new FullTimeEmployee();
			PartTimeEmployee p1 = new PartTimeEmployee();
			
			Emp e;
			e = f1;
			e = p1;
			
			System.out.println("Full Time Emp Details:--");
			f1.DisplayFte();
			System.out.println("");
			System.out.println("");
			System.out.println("Part Time Emp Details:--");
			p1.DisplayPte();
	}
}