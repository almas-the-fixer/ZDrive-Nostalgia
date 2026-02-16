class DemoException extends Exception
{
    public String toString()
    {
        return "Not Sufficient Funds";
    }
}
class Banking
{
    int Balance;
    Banking()
    {
        Balance = 0;
    }
    Banking(int Balance)
    {
        this.Balance = Balance;
    }

    public  void deposit(int depo)
    {
        Balance = Balance + depo;
        System.out.println("Amount deposited \n Balance : "+Balance);
    }
    public  void withdraw(int Withdraw)
    {
        if((Balance - Withdraw) < 0 )
        {
          try
          {
              throw new DemoException();
          } 
          catch(Exception e)
          {
              System.out.println(e);
          }
        }
        else
        {
            Balance = Balance - Withdraw;
            System.out.println("Withdraw Sucessfull \n Balance: "+ Balance);
        }
    }
    public static void main(String args[])
    {
        Banking B1 = new Banking(1000);

        B1.withdraw(400);
        B1.withdraw(600);
        B1.withdraw(500);
    }
}