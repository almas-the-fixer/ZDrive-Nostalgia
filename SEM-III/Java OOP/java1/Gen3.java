class Gen3<T,U>
{
	T a;
	U b;
	
	Gen3(T a1,U b1)
	{
		a = a1;
		b = b1;
	}
	
	T geta()
	{
		return a;
	}
	U getb()
	{
		return b;
	}
	
	void Display()
	{
		System.out.println(a+"\n"+b);
	}
	public static void main(String args[])
	{
		Gen3<Integer,String> g1 = new Gen3<>(101,"Almas");
		g1.Display();
		int iobj;
		String strobj;
		iobj = g1.geta();
		strobj = g1.getb();
		System.out.println("Int value: "+iobj+"\n"+"String Value: "+strobj);
	}
}