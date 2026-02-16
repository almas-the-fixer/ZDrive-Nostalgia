class Complex
{
	Double real;
	Double imag;
	
	Complex(Double real,Double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	static Complex add(Complex n1,Complex n2)
	{
		Complex temp = new Complex(0.0,0.0);
		temp.real = n1.real + n2.real;
		temp.imag = n1.imag + n2.imag;
		
		return(temp);
	}
	public static void main(String args[])
		{
			Complex n1 = new Complex(5.6,7.8);
			Complex n2 = new Complex(4.6,5.8);
			Complex temp;
			temp = add(n1,n2);
			System.out.println("Real Temp: "+temp.real+" Imag temp: "+temp.imag);
		}
}