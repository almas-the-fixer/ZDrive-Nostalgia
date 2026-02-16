class Gen<T>
{
	T value;
	void Display()
	{
		System.out.println(value.getClass().getName());
	}
	
	public static void main(String args[])
		{
		Gen<Integer> gg = new Gen<>();	
		Gen<String> ggg = new Gen<>();	
		Gen<Double> gggg = new Gen<>();	
		
		gg.value = 10;
		ggg.value = "Almas";
		gggg.value = 100.091;
		
		gg.Display();
		ggg.Display();
		gggg.Display();
		
		gg = ggg;
		}
}