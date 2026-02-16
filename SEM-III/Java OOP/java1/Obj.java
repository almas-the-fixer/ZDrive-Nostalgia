class Obj
{
	int al;
		Obj(int a)
		{
			int al = a;
		}
	public String toString()
	{
		String s;
		s = "hiiiiii";
		return s;
	}
	public static void main(String args[])
	{
	Obj p1 = new Obj(10);
	Obj p2 = new Obj(10);
	p1.toString();
	System.out.println(p1);
	int hash = p1.hashCode();
	System.out.println(hash);
	System.out.println("Are objects p1 and p2 equal?? "+p1.equals(p2));
	}
}