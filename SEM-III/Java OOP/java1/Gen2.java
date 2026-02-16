class Gen2<T>
{
	T value;
	
	Gen2(T value) // Generic variable in parameter...
	{
		this.value = value;
	}
	
	T DisplayInt() // Return type Generic variable `T`...
	{
		return value;
	}
	
	public static void main(String args[])
	{
		Gen2<Integer> t1 = new Gen2<>(100); //Class name <data type> object name = new keyword class name <>(); parameter if any....
		Gen2<String> t2 = new Gen2<>("Almas");
		int val1; // A Variable to store returned value with respect to its type...
		String val2; 
		val1 = t1.DisplayInt();
		val2 = t2.DisplayInt();
		System.out.println(">>>>>"+val1+"<<<<<");
		System.out.println(">>>>>"+val2+"<<<<<");
	}
}