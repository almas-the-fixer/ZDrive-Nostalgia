import java.util.*;
class Add
{
	
	/*Method Overloading:Method with same name and different parameters*/
	static int add(int i ,int j)
	{
		return i + j;
	}
	
	static void add(Double a,Double b, Double c)
	{
		Double d = a + b + c;
		System.out.println("Double Addition is: "+d);
	}
	static void add(String a,String b)
	{
		String c = a + b;
		System.out.println("Concatenation is: "+c);
	}
	
	
	public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			Add add1 = new Add();
			Add add2 = new Add();
			Add add3 = new Add();
			
			int sum,a,b;
			Double n1,n2,n3;
			String s1,s2;
			
			//
			System.out.println("Enter First String: ");
			s1 = input.nextLine();
			System.out.println("Enter Second String: ");
			s2 = input.nextLine();
			add(s1,s2); // Static method requires no object to call it i.e we donthave to write "objname.method" in this case "add1.add"
			//
			System.out.println("-------------------------");
			//
			System.out.println("Enter First Integer: ");
			a = input.nextInt();
			System.out.println("Enter Second Integer: ");
			b = input.nextInt();
			sum = add(a,b);
			System.out.println("Integer Addition: "+sum);
			//
			System.out.println("-------------------------");
			//
			System.out.println("Enter First Double: ");
			n1 = input.nextDouble();
			System.out.println("Enter Second Double: ");
			n2 = input.nextDouble();
			System.out.println("Enter Third Double: ");
			n3 = input.nextDouble();
			add(n1,n2,n3); //Double has to be a decimal otherwise it throws error identifying it as int
			//
			
			
		}
}