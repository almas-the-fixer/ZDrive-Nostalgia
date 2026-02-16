import java.util.*;
interface Methods
{
	void deposit();
	void withdraw();
	void calcInterest();
	void viewBalance();
}
class CurrentAccount implements Methods
{
	Scanner sc = new Scanner(System.in);
	int Ac_no;
	Double bal,inter;
	String Cust;
	
	CurrentAccount()
	{
		Ac_no = 101;
		bal = 100000.000;
		inter = 1.25;
		Cust = "Mahesh";
	}
	public void deposit()
	{
		Double depo;
		System.out.println("Enter Amount to deposit: ");
		depo = sc.nextDouble();
		bal = bal + depo;
		System.out.println("Updated Balance: "+bal);
	}
	public void withdraw()
	{
		Double withdraw_amt;
		
		System.out.println("Enter Withdraw amt: ");
		withdraw_amt = sc.nextDouble();
		
		if(withdraw_amt > bal)
		{
			System.out.println("Not Enough Balance to withdraw!!");
		}
		else 
		{
			bal = bal - withdraw_amt;
			System.out.println("Balance after Withdrawal: "+bal);
		}
	}
	public void calcInterest()
	{
		bal = bal * 1.25;
		System.out.println("Balance after interest(1.25%) is: "+bal);
	}
	public void viewBalance()
	{
		System.out.println("Current Balance:");
		System.out.println("Balance: "+bal);
	}
}
class SavingsAccount implements Methods
{
	SavingsAccount()
	{
		Balance = 100000.00;
		Interest = 1.25;
		Acc_no = 1001;
	}
	Scanner sc = new Scanner(System.in);
	int Acc_no;
	Double Balance,Interest;
	public void deposit()
	{
		Double Depo;
		System.out.println("Enter Amount to deposit: ");
		Depo = sc.nextDouble();
		Balance = Balance + Depo;
		System.out.println("Updated Balance: "+Balance);
	}
	public void withdraw()
	{
		Double withdraw_Amt;
		
		System.out.println("Enter Withdraw amt: ");
		withdraw_Amt = sc.nextDouble();
		
		if(withdraw_Amt > Balance)
		{
			System.out.println("Not Enough Balance to withdraw!!");
		}
		else 
		{
			Balance = Balance - withdraw_Amt;
			System.out.println("Balance after Withdrawal: "+Balance);
		}
	}
	public void calcInterest()
	{
		Balance = Balance * 1.25;
		System.out.println("Balance after interest(1.25%) is: "+Balance);
	}
	public void viewBalance()
	{
		System.out.println("Current Balance:");
		System.out.println("Balance: "+Balance);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		SavingsAccount s1 = new SavingsAccount();
		
		System.out.println("Enter Account Credentials: ");
		System.out.println("Enter Account no: ");
		Acc_no = sc.nextInt();
		System.out.println("Enter Balance: ");
		Balance = sc.nextDouble();
		
		s1.viewBalance();
		s1.deposit();
		s1.withdraw();
		s1.calcInterest();
	}
}