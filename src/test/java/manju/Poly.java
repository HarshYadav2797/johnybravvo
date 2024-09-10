package manju;

public class Poly {
	int a=10;
	public void m1()
	{
		a=7;
		System.out.println(a);
	}
	Poly()
	{
		
	}
	Poly(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		Poly s = new Poly();
		s.m1();
	}

}
