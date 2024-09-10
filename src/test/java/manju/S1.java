package manju;

public class S1 extends Thread{
	

	public void run()
	{
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			
			
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		S1 s = new S1();
		//s.start();
		System.out.println(s.toString());
	
	
	}
}
