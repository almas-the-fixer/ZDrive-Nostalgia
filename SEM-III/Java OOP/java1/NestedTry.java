class NestedTry
{
    public static void main(String args[])
    {
        try
        {
            try
            {
                int result = 100 / 0;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled successfully by outer catch!");
        }
        System.out.println("Normal Flow...........");
    }
}