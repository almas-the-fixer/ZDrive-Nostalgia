class Test_throws
{
    public static void method(int a,int b) throws ArithmeticException
    {
        int ans = a / b;
        System.out.println("The Result is: " + ans);
    }
    public static void main(String args[])
    {
        try
        {
            method(10,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the Code!!");
    }
}