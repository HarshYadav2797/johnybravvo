package randomPOmClass;

import org.testng.annotations.Test;

public class ReadDataFromCmdLIne {
	@Test
	public void m1()
	{
		String UN = System.getProperty("username");
		String PW = System.getProperty("password");
		System.out.println(UN);
		System.out.println(PW);
	}
	@Test
	public void m2()
	{
		System.out.println("m2");
	}

}
