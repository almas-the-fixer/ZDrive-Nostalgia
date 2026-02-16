import java.util.*;
class Bank
{
	static int AcId,Amount,depo,temp_withdraw;
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

		System.out.println("Enter Amount to Withdraw: ");
		
		temp_withdraw = withdraw;
		if(Amount>=temp_withdraw)
		{
		Amount = Amount - temp_withdraw;
		}
		System.out.println("Balance after withdraw:"+Amount);
	}
	static int deposit(int deposit)
	{
		
		System.out.println("Enter Amount to deposit: ");
		depo = deposit;
		
		Amount = Amount + depo;
		System.out.println("Balance after deposit:"+Amount);
	}
	void displayDetails()
	{
			System.out.println("Customer name: "+Customer_name);
			System.out.println("Customer id: "+AcId);
			System.out.println("Amount: "+Amount);
	}
	static void countCustomers()
	{
		System.out.println("No of Customers : "+count);
	}
	public static void main(String args[])
	{
		Bank b1 = new Bank(1,"Almas",10000);
		//Bank b2 = new Bank(2,"Harsh",15000);
		
		int wdraw,deposit;
		
		System.out.println("Enter Amount to Withdraw: ");
		wdraw = input.nextInt();
		
		System.out.println("Enter Amount to Deposit: ");
		deposit = input.nextInt();
		
		b1.displayDetails();
		b1.deposit(deposit);
		b1.withDraw(wdraw);
		countCustomers();
	}
}