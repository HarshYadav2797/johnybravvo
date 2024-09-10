package manju;

public class PrimeNumberinRange {
	public PrimeNumberinRange()
	{
		this(10);//by this keyword here we are achieving constructor chaining in same class
		System.out.println("demo constructor");
	}
	public PrimeNumberinRange(int x)
	{
		System.out.println("parameterized constructor");
	}
	public static void main(String[] args) {
		new PrimeNumberinRange();
		
	}
}
