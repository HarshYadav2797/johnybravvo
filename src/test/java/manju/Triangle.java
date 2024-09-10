package manju;

public class Triangle extends Shape{
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	
	}	
	void m1()
	{
		System.out.println(base + " base");
	}
}
