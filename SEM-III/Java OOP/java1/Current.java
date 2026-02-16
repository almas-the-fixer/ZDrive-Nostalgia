class Account
{
	int Account_no,Balance;
	Account()
	{
		Account_no = 0;
		Balance = 0;
	}
	Account(int Account_no,int Balance)
	{
		this.Account_no = Account_no;
		this.Balance = Balance;
	}
	
	void checkBalance()
	{
		System.out.println("Your Account no: "+Account_no);
		System.out.println("Checking Balance....");
		System.out.println("");
		System.out.println("Current Balance is: "+Balance);
	}
	void deposit(int deposit)
	{
		Balance = Balance + deposit;
		System.out.println("Balance After Deposit is: "+Balance);
	}
	void withdraw(int withdraw_amt)
	{
		Balance = Balance - withdraw_amt;
		System.out.println("Amount after Withdraw: "+Balance);
	}
}
class Savings extends Account
{
	float iRate;
	
	Savings()
	{
		iRate = 5;
	}
	Savings(int Account_no,int Balance,float iRate)
	{
		super(Account_no,Balance);
		this.iRate = iRate;
	}
	
	void checkBalance()
	{
		super.checkBalance();
	}
	void deposit(int deposit)
	{
		super.deposit(1000);
	}
	void withdraw()
	{
		super.withdraw(500);
	}
}
class Current extends Account
{
	int odl;
	
	Current()
	{
		odl = 10000;
	}
	Current(int Account_no,int Balance,int odl)
	{
		super(Account_no,Balance);
		this.odl = odl;
	}
	void checkBalance()
	{
		super.checkBalance();
	}
	void deposit()
	{
		super.deposit(5000);
	}
	void withdraw()
	{
		super.withdraw(2500);
	}
	public static void main(String args[])
	{		
		Current c1 = new Current(101,100000,10000);
		System.out.println("-----------------------------------------");
		c1.checkBalance();
		System.out.println("-----------------------------------------");
		c1.deposit();
		System.out.println("_________________________________________");
		c1.checkBalance();
		System.out.println("_________________________________________");
		c1.withdraw();
		System.out.println("_________________________________________");
		c1.checkBalance();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}