import java.util.*;
class Calc
{
	public static void main(String args[])
	{
	int a,b,op,result;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number:");
	a = sc.nextInt();
	System.out.println("Enter Second Number:");
	b = sc.nextInt();

	System.out.println("Enter Operation:");
	op=sc.next().charAt(0);
	
	
	switch (op)
		{
		
		case '+':
			result = a + b;
			System.out.println("Addition is :"+result);
			break;
		case '-':
			result = a - b;
			System.out.println("Subtraction is :"+result);
			break;
		case '*':
			result = a * b;
			System.out.println("Multiplication is :"+result);
			break;
		case '/':
			result = a / b;
			System.out.println("Division is :"+result);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
}