import java.util.*;
class Bank
{
	int AcId,Amount,depo,temp_withdraw;
	String Customer_name;
	Scanner input = new Scanner(System.in);
	static int count;
	
	Bank(int id,String name,int amt)
	{
		AcId = id;
		Customer_name = name;
		Amount = amt;
		count++;
	}
	static int withDraw(int withdraw)
	{
		
	}
	static int deposit(int deposit)
	{
		
	}
	static void displayDetails()
	{
			System.out.println("Customer Name: "+Customer_name);
			System.out.println("Customer Id: "+AcId);
			System.out.println("Amount: "+Amount);
	}
	static void countCustomers()
	{
		System.out.println("No of Customers : "+count);
	}
	public static void main(String args[])
	{
		int choice;
		System.out.println("Enter Choice: ");
		choice = input.nextInt();
		
		System.out.println("Please Enter a Choice:");
		System.out.println("1:View Account Details.");
		System.out.println("2:Withdraw Amount.");
		System.out.println("3:Deposit Amount.");
		System.out.println("Exit.");
		
		switch choice
		{
			case 1:
			System.out.println("You Selected View Account Details:");
			displayDetails();
			break;
			
			case 2:
			System.out.println("You Selected Withdraw:");
			withDraw();
			break;
			
			case 3:
			System.out.println("You Selected Deposit:");
			deposit();
			break;
			
			default:
			System.out.println("Please Select a Valid Choice!!");
			break;
		}
	}
}